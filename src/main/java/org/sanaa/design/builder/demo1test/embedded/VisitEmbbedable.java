package org.sanaa.design.builder.demo1test.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class VisitEmbbedable implements Serializable {
    private Long visitorId;
    private Long waitingListId;

}
