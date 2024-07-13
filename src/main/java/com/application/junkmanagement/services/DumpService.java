package com.application.junkmanagement.services;

import com.application.junkmanagement.Repository.IllegalDumpReportRepositoy;
import com.application.junkmanagement.Repository.WasteCollectionRepository;
import com.application.junkmanagement.models.IllegalDumpReport;
import com.application.junkmanagement.models.WasteCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DumpService {
    @Autowired
    IllegalDumpReportRepositoy illegalDumpReportRepositoy;

    @Autowired
    WasteCollectionRepository wasteCollectionRepository;

    public List<IllegalDumpReport> illegalDumpReport() {
        return illegalDumpReportRepositoy.getAll();
    }

    public IllegalDumpReport createIllegalDumpReport(IllegalDumpReport input) {
        input.setStatus(IllegalDumpReport.Status.REPORTED);
        return illegalDumpReportRepositoy.save(input);
    }

    public WasteCollection requestWastePickup(WasteCollection input) {
        return wasteCollectionRepository.save(input);
    }

    public WasteCollection getDetailWaste(Long id) {
        return wasteCollectionRepository.getById(id);
    }

    public List<WasteCollection> wasteCollectionByUserId(Long id) {
        return wasteCollectionRepository.findByUserId(id);
    }
}
