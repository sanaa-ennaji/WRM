package org.sanaa.design.builder.demo1test.entity;


import jakarta.persistence.*;
import org.sanaa.design.builder.demo1test.entity.enums.VisitorStatus;

import java.time.LocalDateTime;


@Entity
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDateTime arrivalTime;

    @Enumerated(EnumType.STRING)
    private VisitorStatus status;

    private Integer priority;
    private Integer estimatedProcessingTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
