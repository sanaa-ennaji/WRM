package org.sanaa.design.builder.demo1test.embedded;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class VisitEmbbedable implements Serializable {
    private Long visitorId;
    private Long waitingListId;

    public VisitEmbbedable() {}

    public VisitEmbbedable(Long visitorId, Long waitingListId) {
        this.visitorId = visitorId;
        this.waitingListId = waitingListId;
    }
}
