package com.application.junkmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "recycling_center_waste_type")
@Setter
@Getter
public class RecyclingCenterWasteType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long recyclingCenterId;
    private Long wasteTypeId;
    private Boolean acceptanceStatus;
}
