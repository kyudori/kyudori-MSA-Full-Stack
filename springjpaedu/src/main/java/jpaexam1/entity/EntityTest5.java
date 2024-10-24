package jpaexam1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Getter
@Setter
@ToString
@Entity
public class EntityTest5 {
	@Id
	int id;
	private String username;
	// 연관관계 매핑
	@ManyToOne
	private Team a;
	
	public EntityTest5() {
	}
	public EntityTest5(String username, Team team) {
		this.username = username;
		a = team;
	}
}
