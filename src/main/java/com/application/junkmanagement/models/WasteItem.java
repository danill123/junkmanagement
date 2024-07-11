package com.application.junkmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "waste_item")
@Getter
@Setter
public class WasteItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long wasteTypeId;
    private Long wasteCollectionId;
    private Long quantity;
    private Long weight;
}
