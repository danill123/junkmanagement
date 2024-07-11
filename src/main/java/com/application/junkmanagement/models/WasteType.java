package com.application.junkmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "waste_type")
@Entity
@Setter
@Getter
public class WasteType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Boolean recyclable;
}
