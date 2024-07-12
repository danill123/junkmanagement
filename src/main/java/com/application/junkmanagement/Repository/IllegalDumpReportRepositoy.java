package com.application.junkmanagement.Repository;

import com.application.junkmanagement.models.IllegalDumpReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IllegalDumpReportRepositoy extends JpaRepository<IllegalDumpReport, Long> {

    @Query("SELECT illegal_dump_report FROM IllegalDumpReport illegal_dump_report")
    List<IllegalDumpReport> getAll();
}
