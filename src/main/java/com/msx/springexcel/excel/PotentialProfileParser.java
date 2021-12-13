package com.msx.springexcel.excel;

import com.msx.springexcel.model.PotentialProfile;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;


@Slf4j
public class PotentialProfileParser {

    private String getStringCellValue(Cell cell) {
        String cellValue = null;

        if (cell!=null) {
            switch (cell.getCellType()) {
                case BOOLEAN:
                    System.out.println(cell.getBooleanCellValue());
                    break;
                case NUMERIC:
                    System.out.println(cell.getNumericCellValue());
                    break;
                case STRING:
                    System.out.println(cell.getStringCellValue());
                    break;
                case BLANK:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + cell.getCellType());
            }
        }

        return cellValue;
    }

    private static Map<String, Integer> getHeader(Row row) {
        DataFormatter formatter = new DataFormatter();
        Map<String, Integer> header = new HashMap<String,Integer>();

        short minColIx = row.getFirstCellNum(); //get the first column index for a row
        short maxColIx = row.getLastCellNum(); //get the last column index for a row
        for(short colIx=minColIx; colIx<maxColIx; colIx++) {
            Cell cell = row.getCell(colIx);
            header.put(formatter.formatCellValue(cell),cell.getColumnIndex());
        }

        return header;

    }


    public static List<PotentialProfile> excelToPotentialProfileList(InputStream is) throws IOException {

        List<PotentialProfile> potentialProfileList = new ArrayList();

        DataFormatter formatter = new DataFormatter();
        Workbook workbook = new XSSFWorkbook(is);

        Sheet sheet = workbook.getSheetAt(0);
        int totalRows = sheet.getPhysicalNumberOfRows();

        log.info(String.valueOf(totalRows));

        Map<String, Integer> map;
        Row row = sheet.getRow(0);

        map = getHeader(row);

        log.info(String.valueOf(map));


        return potentialProfileList;
    }

}
