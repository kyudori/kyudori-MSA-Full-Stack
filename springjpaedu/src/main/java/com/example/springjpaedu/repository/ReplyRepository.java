package com.example.springjpaedu.repository;

import com.example.springjpaedu.entity.Meeting;
import com.example.springjpaedu.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Integer>{
	public List<Reply> findByRefidId(int id);
	@Query("select t from Reply t join fetch t.refid")
	public List<Reply> findAllJoinFetch();
}
