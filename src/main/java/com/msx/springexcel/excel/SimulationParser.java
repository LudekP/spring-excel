package com.msx.springexcel.excel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.msx.springexcel.model.Simulation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
public class SimulationParser {

    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    private static final String SHEET = "Sheet1";

    public static boolean isExcelFormat(MultipartFile file) {

        return TYPE.equals(file.getContentType());
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return true;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void validateSimulation(int rowNumber, Simulation sim) {

        // Check if column is numeric
        if (!isNumeric(sim.getIdTestQuery())) {
            throw new RuntimeException("Column Col_01 doesn't contain numeric value on row " + rowNumber + ". Value is " + sim.getIdTestQuery());
        }

    }

    public static List<Simulation> excelToSimulations(InputStream is) {
        int rowNumber = 0;
        int cellIdx = 0;

        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();

            List<Simulation> simulations = new ArrayList<>();

            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                Simulation simulation = new Simulation();

                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    switch (cellIdx) {
                        case 0:
                            simulation.setIdTestQuery(currentCell.getStringCellValue());
                            break;

                        case 1:
                            simulation.setCol_01(currentCell.getStringCellValue());
                            break;

                        case 2:
                            simulation.setCol_02(currentCell.getStringCellValue());
                            break;

                        case 3:
                            simulation.setCol_03(currentCell.getStringCellValue());
                            break;

                        case 4:
                            simulation.setCol_04(currentCell.getStringCellValue());
                            break;

                        case 5:
                            simulation.setCol_05(currentCell.getStringCellValue());
                            break;

                        case 6:
                            simulation.setCol_06(currentCell.getStringCellValue());
                            break;

                        case 7:
                            simulation.setCol_07(currentCell.getStringCellValue());
                            break;

                        case 8:
                            simulation.setCol_08(currentCell.getStringCellValue());
                            break;

                        case 9:
                            simulation.setCol_09(currentCell.getStringCellValue());
                            break;

                        case 10:
                            simulation.setCol_10(currentCell.getStringCellValue());
                            break;

                        case 11:
                            simulation.setCol_11(currentCell.getStringCellValue());
                            break;

                        case 12:
                            simulation.setCol_12(currentCell.getStringCellValue());
                            break;

                        case 13:
                            simulation.setCol_13(currentCell.getStringCellValue());
                            break;

                        case 14:
                            simulation.setCol_14(currentCell.getStringCellValue());
                            break;

                        case 15:
                            simulation.setCol_15(currentCell.getStringCellValue());
                            break;

                        case 16:
                            simulation.setCol_16(currentCell.getStringCellValue());
                            break;

                        case 17:
                            simulation.setCol_17(currentCell.getStringCellValue());
                            break;

                        case 18:
                            simulation.setCol_18(currentCell.getStringCellValue());
                            break;

                        case 19:
                            simulation.setCol_19(currentCell.getStringCellValue());
                            break;

                        case 20:
                            simulation.setCol_20(currentCell.getStringCellValue());
                            break;

                        case 21:
                            simulation.setCol_21(currentCell.getStringCellValue());
                            break;

                        case 22:
                            simulation.setCol_22(currentCell.getStringCellValue());
                            break;

                        case 23:
                            simulation.setCol_23(currentCell.getStringCellValue());
                            break;

                        case 24:
                            simulation.setCol_24(currentCell.getStringCellValue());
                            break;

                        case 25:
                            simulation.setCol_25(currentCell.getStringCellValue());
                            break;

                        case 26:
                            simulation.setCol_26(currentCell.getStringCellValue());
                            break;

                        case 27:
                            simulation.setCol_27(currentCell.getStringCellValue());
                            break;

                        case 28:
                            simulation.setCol_28(currentCell.getStringCellValue());
                            break;

                        case 29:
                            simulation.setCol_29(currentCell.getStringCellValue());
                            break;

                        case 30:
                            simulation.setCol_30(currentCell.getStringCellValue());
                            break;

                        default:
                            break;
                    }

                    cellIdx++;

                }

                rowNumber++;

                // Validate simulation
                validateSimulation(rowNumber, simulation);

                simulations.add(simulation);
            }

            workbook.close();

            return simulations;
        } catch (Exception e) {
            log.error("Failed to parse Excel file: " + e.getMessage() + " - RowNumber: " + rowNumber + ", CellIndex: " + cellIdx);
            throw new RuntimeException("Failed to parse Excel file: " + e.getMessage());
        }
    }
}
