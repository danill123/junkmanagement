package com.application.junkmanagement.services;

import com.application.junkmanagement.Repository.IllegalDumpReportRepositoy;
import com.application.junkmanagement.models.IllegalDumpReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DumpService {
    @Autowired
    IllegalDumpReportRepositoy illegalDumpReportRepositoy;

    public List<IllegalDumpReport> illegalDumpReport() {
        return illegalDumpReportRepositoy.getAll();
    }

    public IllegalDumpReport createIllegalDumpReport(IllegalDumpReport input) {
        input.setStatus(IllegalDumpReport.Status.REPORTED);
        return illegalDumpReportRepositoy.save(input);
    }
}
