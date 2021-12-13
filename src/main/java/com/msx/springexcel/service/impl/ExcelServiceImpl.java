package com.msx.springexcel.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msx.springexcel.excel.PotentialProfileParser;
import com.msx.springexcel.excel.SimulationParser;
import com.msx.springexcel.model.PotentialProfile;
import com.msx.springexcel.model.Simulation;
import com.msx.springexcel.service.ExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Service
public class ExcelServiceImpl implements ExcelService {

    private final ObjectMapper mapper;
    private final String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";


    public ExcelServiceImpl(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public boolean isExcelFormat(MultipartFile file) {
        return TYPE.equals(file.getContentType());
    }

    @Override
    public void convertAndValidateSimulationFile(MultipartFile file) {
        try {
            log.info("Start parsing excel file");
            List<Simulation> simulations = SimulationParser.excelToSimulations(file.getInputStream());

            log.info("Store file as json");
            mapper.writeValue(new File("E:/Git/simulations.json"), simulations);

        } catch (IOException e) {
            throw new RuntimeException("Failed to parse simulation data: " + e.getMessage());
        }

    }

    @Override
    public void convertAndValidatePotentialProfileFile(MultipartFile file) {
        try {
            log.info("Start parsing excel file");
            List<PotentialProfile> potentialProfileList = PotentialProfileParser.excelToPotentialProfileList(file.getInputStream());

            log.info("Store file as json");
            mapper.writeValue(new File("E:/Git/potential_profile.json"), potentialProfileList);

        } catch (IOException e) {
            throw new RuntimeException("Failed to parse simulation data: " + e.getMessage());
        }
    }
}
