package com.application.junkmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "recycling_center")
public class RecyclingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long addressId;
    private Long currentLoad;
}
