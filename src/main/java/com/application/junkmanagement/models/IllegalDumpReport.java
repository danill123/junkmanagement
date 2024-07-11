package com.application.junkmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "illegal_dump_report")
@Setter
@Getter
public class IllegalDumpReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long reporterId;
    private Long addressId;
    private String description;

    public enum Status {
        REPORTED, UNDER_INVESTIGATION, RESOLVED
    }

    @Enumerated(EnumType.STRING)
    private Status status;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date reportDate;


}
