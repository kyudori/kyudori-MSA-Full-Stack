package com.example.springrestedu.repository;

import com.example.springrestedu.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
    List<Friend> findByFname(String fname);
}
