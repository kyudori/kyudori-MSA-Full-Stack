package jpaexam2.model.entity;

import lombok.*;

import jakarta.persistence.*;
@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String content;
	@ManyToOne( optional = false )
	@JoinColumn(name = "refid")
	private Meeting refid;
}
