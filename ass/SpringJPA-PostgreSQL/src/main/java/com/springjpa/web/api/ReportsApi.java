package com.springjpa.web.api;

import com.springjpa.web.dto.reports.ReportsInputDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

public class ReportsApi {





    @PostMapping(value = "/api/report/biletix/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> generateDHLEDIFile(HttpServletRequest request,
                                                     @RequestBody ReportsInputDTO input) {


System.out.println(input);

return null;
        }
    }


