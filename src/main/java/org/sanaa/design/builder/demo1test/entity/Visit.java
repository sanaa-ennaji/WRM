package org.sanaa.design.builder.demo1test.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.sanaa.design.builder.demo1test.embedded.VisitEmbbedable;

import java.time.LocalDateTime;

@Data
@Entity
public class Visit {
    @EmbeddedId
    private VisitEmbbedable id;

    @ManyToOne
    @MapsId("visitorId")
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    @ManyToOne
    @MapsId("waitingListId")
    @JoinColumn(name = "waiting_list_id")
    private WaitingList waitingList;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
