package com.example.springnews.controller;

import com.example.springnews.model.News;
import com.example.springnews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NewsController {
    @Autowired
    NewsRepository newsRepository;

    // 뉴스 메인 페이지 로딩
    @GetMapping("/newsmain")
    public String newsmain() {
        return "newsmain";
    }

    // 모든 뉴스 가져오기
    @GetMapping("/news/all")
    @ResponseBody
    public Page<News> getAllNewsAjax(Pageable pageable) {
        return newsRepository.findAll(pageable);
    }

    // 특정 뉴스 가져오기 및 조회수 증가
    @GetMapping("/one/{id}")
    @ResponseBody
    public ResponseEntity<News> getNewsByIdAjax(@PathVariable("id") int id) {
        return newsRepository.findById(id)
                .map(news -> {
                    news.setCnt(news.getCnt() + 1);
                    newsRepository.save(news);
                    return ResponseEntity.ok(news);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // 뉴스 생성
    @PostMapping("/insert")
    @ResponseBody
    public ResponseEntity<News> createNewsAjax(@RequestBody News news) {
        news.setCnt(0); // 조회수 초기화
        News savedNews = newsRepository.save(news);
        return ResponseEntity.ok(savedNews);
    }

    // 뉴스 수정
    @PostMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<News> updateNewsAjax(@PathVariable("id") int id, @RequestBody News newsDetails) {
        return newsRepository.findById(id)
                .map(news -> {
                    news.setTitle(newsDetails.getTitle());
                    news.setWriter(newsDetails.getWriter());
                    news.setContent(newsDetails.getContent());
                    newsRepository.save(news);
                    return ResponseEntity.ok(news);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // 뉴스 삭제
    @GetMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteNewsAjax(@PathVariable("id") int id) {
        return newsRepository.findById(id)
                .map(news -> {
                    newsRepository.delete(news);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // 뉴스 검색
    @GetMapping("/search")
    @ResponseBody
    public Page<News> searchNewsAjax(@RequestParam(required = false) String type,
                                     @RequestParam(required = false) String term,
                                     Pageable pageable) {
        if ((type != null && !type.isEmpty()) && (term != null && !term.isEmpty())) {
            if (type.equals("keyword")) {
                return newsRepository.findByContentContaining(term, pageable);
            } else if (type.equals("writer")) {
                return newsRepository.findByWriter(term, pageable);
            }
        }
        return newsRepository.findAll(pageable);
    }
}
