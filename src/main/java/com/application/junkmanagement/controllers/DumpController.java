package com.application.junkmanagement.controllers;

import com.application.junkmanagement.dto.ResponseDto;
import com.application.junkmanagement.models.IllegalDumpReport;
import com.application.junkmanagement.services.DumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dump")
public class DumpController {
    @Autowired
    DumpService dumpService;

    @GetMapping("/illegal-report")
    public ResponseEntity<List<IllegalDumpReport>> IllegalReport() {
        return ResponseEntity.ok(dumpService.illegalDumpReport());
    }

    @PostMapping("/illegal-report")
    public ResponseEntity<ResponseDto> createIllegalDumpReport(@RequestBody IllegalDumpReport input) {
        ResponseDto response = new ResponseDto();
        try {
            dumpService.createIllegalDumpReport(input);
            response.setMessage("Report was create");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch(Exception ex) {
            response.setMessage(ex.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
