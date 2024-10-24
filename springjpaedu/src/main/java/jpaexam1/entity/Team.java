package jpaexam1.entity;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Team {
	@Id
	@Column(name = "TEAM_ID")	
	private String id;
	private String name;
}
