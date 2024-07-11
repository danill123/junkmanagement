package com.application.junkmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Table(name = "reward")
@Entity
@Setter
@Getter
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long points;
    private String Name;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date earnedDate;
}
