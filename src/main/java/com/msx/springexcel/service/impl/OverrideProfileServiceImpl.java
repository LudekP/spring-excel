package com.msx.springexcel.service.impl;

import com.github.pjfanning.xlsx.StreamingReader;
import com.msx.springexcel.model.OverrideProfileFile;
import com.msx.springexcel.model.PotentialProfile;
import com.msx.springexcel.service.OverrideProfileService;
import com.opencsv.CSVWriter;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;


@Slf4j
@Service
public class OverrideProfileServiceImpl implements OverrideProfileService {

    DataFormatter formatter = new DataFormatter();
    DecimalFormat percentDecimalFormat = new DecimalFormat("0%");

    @Override
    public OverrideProfileFile convert2csv(File excel) {

        log.info("File header");
        OverrideProfileFile overrideProfileFile = new OverrideProfileFile();
        overrideProfileFile.setName("override.csv");
        overrideProfileFile.setPath("E:/Git");

        log.info("Start processing");

        PotentialProfile potentialProfile = new PotentialProfile();

        log.info("Streaming");

        try (InputStream is = new FileInputStream(excel)) {

            Workbook workbook = StreamingReader.builder()
                    .rowCacheSize(100)
                    .bufferSize(4096)
                    .open(is);

            log.info("Create csv file");

            Sheet sheet = workbook.getSheetAt(0);

            // Create csv file
            File csvFile = new File(overrideProfileFile.getPath(), overrideProfileFile.getName());
            CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFile, StandardCharsets.UTF_8),'|', CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);


            for (Row row : sheet) {

                // Process header row
                if (row.getRowNum() == 0) {
                    log.info("Process header row");
                    overrideProfileFile.setHeader(getHeader(row));
                    log.info(String.valueOf(potentialProfile.getHeader()));
                    continue;
                }

                ///row.getCell(1);


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
