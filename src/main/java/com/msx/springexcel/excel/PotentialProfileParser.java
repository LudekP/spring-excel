package com.msx.springexcel.excel;

import com.github.pjfanning.xlsx.StreamingReader;
import com.msx.springexcel.model.PotentialProfile;
import com.msx.springexcel.model.PotentialProfileFile;
import com.opencsv.CSVWriter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.*;


@Slf4j
public class PotentialProfileParser {

//    private String getStringCellValue(Cell cell) {
//        String cellValue = null;
//
//        if (cell!=null) {
//            switch (cell.getCellType()) {
//                case BOOLEAN:
//                    System.out.println(cell.getBooleanCellValue());
//                    break;
//                case NUMERIC:
//                    System.out.println(cell.getNumericCellValue());
//                    break;
//                case STRING:
//                    System.out.println(cell.getStringCellValue());
//                    break;
//                case BLANK:
//                    break;
//                default:
//                    throw new IllegalStateException("Unexpected value: " + cell.getCellType());
//            }
//        }
//
//        return cellValue;
//    }

    private static Map<String, Integer> getHeader(Row headerRow) {

        DataFormatter formatter = new DataFormatter();
        Map<String, Integer> header = new HashMap<>();

        for (Cell cell : headerRow) {
            header.put(formatter.formatCellValue(cell),cell.getColumnIndex());
        }

        return header;

    }

    private static String convertPercentToNumber(DecimalFormat decimalFormat, String percent) {

        if (!StringUtils.isBlank(percent)) {
            try {
                return String.valueOf(decimalFormat.parse(percent));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;

    }


    public static PotentialProfileFile excelToPotentialProfileList(File file) throws IOException {

        DecimalFormat decimalFormat = new DecimalFormat("0%");
        decimalFormat.setParseBigDecimal(true);

        log.info("File header");
        PotentialProfileFile potentialProfileFile = new PotentialProfileFile();
        potentialProfileFile.setName("potential.csv");
        potentialProfileFile.setPath("E:/Git");

        log.info("Start processing");

        PotentialProfile potentialProfile = new PotentialProfile();

        DataFormatter formatter = new DataFormatter();
        log.info("Streaming");

        try (InputStream is = new FileInputStream(file)) {

            Workbook workbook = StreamingReader.builder()
                    .rowCacheSize(100)
                    .bufferSize(4096)
                    .open(is);
                    //new XSSFWorkbook(is);

            log.info("Create csv file");

            Sheet sheet = workbook.getSheetAt(0);

            // Create csv file
            File csvFile = new File(potentialProfileFile.getPath(), potentialProfileFile.getName());
            CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFile, StandardCharsets.UTF_8),'|', CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);


            for (Row row : sheet) {

                // Process header row
                if (row.getRowNum() == 0) {
                    log.info("Process header row");
                    potentialProfileFile.setHeader(getHeader(row));
                    log.info(String.valueOf(potentialProfileFile.getHeader()));
                    continue;
                }

                //
                for (int i = 0; i < potentialProfileFile.getHeader().size(); i++) {

                    Cell cell = row.getCell(i);

                    potentialProfile.setExcelRowId(String.valueOf(row.getRowNum()));

                    switch (i) {

                        case 1:
                            potentialProfile.setOfferRegionId(formatter.formatCellValue(cell));
                            break;

                        case 2:
                            potentialProfile.setProductLineCd(formatter.formatCellValue(cell));
                            break;

                        case 3:
                            potentialProfile.setNwProductCd(formatter.formatCellValue(cell));
                            break;

                        case 4:
                            potentialProfile.setBillTypeCd(formatter.formatCellValue(cell));
                            break;

                        case 5:
                            potentialProfile.setPricingCtryCd(formatter.formatCellValue(cell));
                            break;

                        case 6:
                            potentialProfile.setLclProductCd(formatter.formatCellValue(cell));
                            break;

                        case 7:
                            potentialProfile.setOrigRegionCd(formatter.formatCellValue(cell));
                            break;

                        case 8:
                            potentialProfile.setOrigCtryCd(formatter.formatCellValue(cell));
                            break;

                        case 9:
                            potentialProfile.setOrigSvcArea(formatter.formatCellValue(cell));
                            break;

                        case 10:
                            potentialProfile.setOrigZipCd(formatter.formatCellValue(cell));
                            break;

                        case 11:
                            potentialProfile.setDestRegionCd(formatter.formatCellValue(cell));
                            break;

                        case 12:
                            potentialProfile.setDestCtryCd(formatter.formatCellValue(cell));
                            break;

                        case 13:
                            potentialProfile.setDestSvcArea(formatter.formatCellValue(cell));
                            break;

                        case 14:
                            potentialProfile.setDestZipCd(formatter.formatCellValue(cell));
                            break;

                        case 15:
                            potentialProfile.setShipCnt(formatter.formatCellValue(cell));
                            break;

                        case 16:
                            potentialProfile.setAvgWghtKg(formatter.formatCellValue(cell));
                            break;

                        case 17:
                            potentialProfile.setAvgWghtLb(formatter.formatCellValue(cell));
                            break;

                        case 18:
                            potentialProfile.setPiecesPerShip(formatter.formatCellValue(cell));
                            break;

                        case 19:
                            potentialProfile.setClrnceTypeCd(formatter.formatCellValue(cell));
                            break;

                        case 20:
                            potentialProfile.setSurcharge1Cd(formatter.formatCellValue(cell));
                            break;

                        case 21:
                            potentialProfile.setSurcharge2Cd(formatter.formatCellValue(cell));
                            break;

                        case 22:
                            potentialProfile.setSurcharge3Cd(formatter.formatCellValue(cell));
                            break;

                        case 23:
                            potentialProfile.setSurcharge4Cd(formatter.formatCellValue(cell));
                            break;

                        case 24:
                            potentialProfile.setSurcharge5Cd(formatter.formatCellValue(cell));
                            break;

                        case 25:
                            potentialProfile.setSurcharge6Cd(formatter.formatCellValue(cell));
                            break;

                        case 26:
                            potentialProfile.setSurcharge7Cd(formatter.formatCellValue(cell));
                            break;

                        case 27:
                            potentialProfile.setSurcharge8Cd(formatter.formatCellValue(cell));
                            break;

                        case 28:
                            potentialProfile.setSurcharge9Cd(formatter.formatCellValue(cell));
                            break;

                        case 29:
                            potentialProfile.setSurcharge10Cd(convertPercentToNumber(decimalFormat, formatter.formatCellValue(cell)));
                            break;

                        default:
                            break;
                    }

                }

                log.info(potentialProfile.toString());

                csvWriter.writeNext(potentialProfile.getString());
                potentialProfile.reset();

            }

            workbook.close();
            csvWriter.close();


        } catch (IOException e) {
            throw new IOException("fail to read excel file : " + e.getMessage(), e);
        }

        return potentialProfileFile;
    }

}
