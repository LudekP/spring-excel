package com.msx.springexcel.service;

import org.springframework.web.multipart.MultipartFile;

public interface ExcelService {

    public void convertAndValidateSimulationFile(MultipartFile file);

}
