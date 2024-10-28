package jpaexam2.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Emp {
    @Id
    private int empno;
    @Column(length = 14)
    private String ename;
    @Column(length = 30)
    private String job;
    private Integer mgr;
    private java.sql.Date  hiredate;
    private int sal;
    private Integer comm;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="deptno")
    private Dept deptno;
}
