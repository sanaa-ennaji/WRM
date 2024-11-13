package org.sanaa.design.builder.demo1test.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class VisitEmbbedable implements Serializable {
    private Long visitorId;
    private Long waitingRoomId;


    public VisitEmbbedable() {}

    public VisitEmbbedable(Long visitorId, Long waitingRoomId) {
        this.visitorId = visitorId;
        this.waitingRoomId = waitingRoomId;
    }
}
