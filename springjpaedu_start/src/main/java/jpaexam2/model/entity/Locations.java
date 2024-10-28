package jpaexam2.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Locations {
    @Id
    @Column(columnDefinition = "char(2)")
    private String loc_code;
    @Column(length = 20)
    private String city;
}
