package com.application.junkmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "waste_collection")
@Entity
@Setter
@Getter
public class WasteCollection {

    public enum Status {
        SCHEDULED, COMPLETED, CANCELLED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Date collectionDate;

    @Enumerated(EnumType.STRING)
    private Status status;
    private String notes;
}
