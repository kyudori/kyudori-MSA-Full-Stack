package jpaexam2.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Dept {
    @Id
    private int deptno;
    @Column(length = 20)
    private String dname;
    @ManyToOne
    @JoinColumn(name="loc_code", referencedColumnName = "loc_code")
    private Locations loc_code;
}