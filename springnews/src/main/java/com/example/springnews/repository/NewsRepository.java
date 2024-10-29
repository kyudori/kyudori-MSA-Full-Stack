package com.example.springnews.repository;

import com.example.springnews.model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Integer> {
    List<News> findByContentContaining(String content);
    List<News> findByWriter(String writer);

    Page<News> findByContentContaining(String content, Pageable pageable);
    Page<News> findByWriter(String writer, Pageable pageable);
}
