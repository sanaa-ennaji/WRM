package org.sanaa.design.builder.demo1test.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sanaa.design.builder.demo1test.enums.VisitorStatus;

import java.time.LocalDateTime;
import java.util.List;



@Data
@Entity
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime arrivalTime;

    @Enumerated(EnumType.STRING)
    private VisitorStatus status;

    private Integer priority; //  priority-based

    private Integer estimatedProcessingTime; // shortest job first

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    @OneToMany(mappedBy = "visitor", cascade = CascadeType.ALL)
    private List<Visit> visits;

}
