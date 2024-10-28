package jpaexam1.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class EntityTest4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIME)
    private java.util.Date utilTime;

    @Temporal(TemporalType.DATE)
    private java.util.Date utilDate;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date utilTimestamp;

    private java.util.Date utilPlainDate;
    private java.sql.Date sqlPlainDate;

    @Column(columnDefinition = "TIME")
    private LocalTime localTime1;
    private LocalTime localTime2;

    @Column(columnDefinition = "DATE")
    private LocalDate localDate1;
    private LocalDate localDate2;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime1;
    private LocalDateTime localDateTime2;

}
