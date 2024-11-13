package org.sanaa.design.builder.demo1test.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class WaitingList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    @OneToMany(mappedBy = "waitingRoom")
    private List<Visit> visits;
}