package com.msx.springexcel.service;

import org.springframework.web.multipart.MultipartFile;

public interface ExcelService {

    public boolean isExcelFormat(MultipartFile file);

    public void convertAndValidateSimulationFile(MultipartFile file);

    public void convertAndValidatePotentialProfileFile(MultipartFile file);

}
