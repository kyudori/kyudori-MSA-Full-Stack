package com.example.springjpaedu.repository;

import com.example.springjpaedu.entity.Member;
import com.example.springjpaedu.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MemberTeamLockerRepository extends JpaRepository<Member, Integer>{
	@Query("select m from Member m ")
	public List<Member> getAllData();

	@Query("select m from Member m join fetch m.team join fetch m.locker")
	public List<Member> getAllDataFetchJoin();

	@Query("select m from Member m where m.team.name = :tn")
	public List<Member> getWithJPQL1(@Param("tn") String tname);

	public List<Member> findByTeamName(String name);

	@Query("select m.team.name from Member m where m.username = :un")
	public String getWithJPQL2(@Param("un") String username);

	public TeamName getByUsername(String username);

	public Member  getByLockerName(String lname);
	
	public List<Member> findByUsername(String username);

	public Long countByUsername(String username);
}

