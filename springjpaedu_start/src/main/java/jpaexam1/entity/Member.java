package jpaexam1.entity;

import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="membertbl")
public class Member {
	@Id
	@Column(name = "MEMBER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	// 연관관계 매핑
	@ManyToOne
	@JoinColumn(name = "TEAM_ID")
	private Team team;
	@OneToOne
	@JoinColumn(name = "LOCKER_ID")
	private Locker locker;

	public Member(String username, Team team, Locker locker) {
		super();
		this.username = username;
		this.team = team;
		this.locker = locker;
	}
}
