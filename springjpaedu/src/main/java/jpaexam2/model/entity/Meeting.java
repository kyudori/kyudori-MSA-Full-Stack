package jpaexam2.model.entity;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@Entity
public class Meeting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String title;
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime  meetingDate;
}
