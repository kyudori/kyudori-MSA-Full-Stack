package com.example.springnews.repository;

import com.example.springnews.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByNewsId(int newsId);
}
