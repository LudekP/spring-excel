package com.msx.springexcel.rest;

import com.msx.springexcel.excel.SimulationParser;
import com.msx.springexcel.model.ResponseMessage;
import com.msx.springexcel.service.ExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("/api/excel")
public class Controller {

    private final ExcelService excelService;

    public Controller(ExcelService excelService) {
        this.excelService = excelService;
    }

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";

        if (excelService.isExcelFormat(file)) {
            try {
                excelService.convertAndValidateSimulationFile(file);

                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                log.info(message + e.getMessage());
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }

        message = "Please upload an excel simulation file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }

    @PostMapping("/upload/potential-profile")
    public ResponseEntity<ResponseMessage> uploadPotentialProfileFile(@RequestParam("file") MultipartFile file) {
        String message = "";

        if (excelService.isExcelFormat(file)) {
            try {
                excelService.convertAndValidatePotentialProfileFile(file);

                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                log.info(message + e.getMessage());
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }

        message = "Please upload an excel potential profile file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }

}
