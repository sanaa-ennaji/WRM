package org.sanaa.design.builder.demo1test.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Visit {
    @EmbeddedId
    private VisitEmbbedable visitEmbbedable;

    @ManyToOne
    @MapsId("visitEmbbedable")
    private Visitor visitor;

    @ManyToOne
    @MapsId("waitingListId")
    private WaitingList waitingList;

    private LocalDateTime serviceStartTime;
    private LocalDateTime serviceEndTime;
}
