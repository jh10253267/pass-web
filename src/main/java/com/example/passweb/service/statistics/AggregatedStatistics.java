package com.example.passweb.service.statistics;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AggregatedStatistics {
    private LocalDateTime statisticsAt; // 일 단위
    private long allCount;
    private long attendedCount;
    private long cancelledCount;

    public void merge(final AggregatedStatistics statistics) {
        this.allCount += statistics.getAllCount();
        this.attendedCount += statistics.getAttendedCount();
        this.cancelledCount += statistics.getCancelledCount();

    }
}
