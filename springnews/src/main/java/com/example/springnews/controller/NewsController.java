package com.example.springnews.controller;

import com.example.springnews.model.News;
import com.example.springnews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    // 뉴스 메인 페이지 로딩 (Thymeleaf 렌더링)
    @GetMapping("/newsmain")
    public String newsmain(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "term", required = false) String term,
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "editId", required = false) Integer editId,
            @RequestParam(value = "new", required = false) Boolean isNew,
            Model model) {

        PageRequest pageable = PageRequest.of(page, 5);
        Page<News> newsPage;

        if (type != null && term != null && !term.isEmpty()) {
            if ("keyword".equals(type)) {
                newsPage = newsRepository.findByContentContaining(term, pageable);
            } else if ("writer".equals(type)) {
                newsPage = newsRepository.findByWriter(term, pageable);
            } else {
                newsPage = newsRepository.findAll(pageable);
            }
        } else {
            newsPage = newsRepository.findAll(pageable);
        }

        model.addAttribute("newsPage", newsPage);
        model.addAttribute("type", type);
        model.addAttribute("term", term);

        // 상세 보기
        if (id != null) {
            News selectedNews = newsRepository.findById(id).orElse(null);
            selectedNews.setCnt(selectedNews.getCnt() + 1);
            newsRepository.save(selectedNews);
            model.addAttribute("selectedNews", selectedNews);
        }

        // 수정 폼
        if (editId != null) {
            News editNews = newsRepository.findById(editId).orElse(null);
            model.addAttribute("formVisible", true);
            model.addAttribute("isEdit", true);
            model.addAttribute("formNews", editNews);
        }

        // 신규 작성 폼
        if (isNew != null && isNew) {
            model.addAttribute("formVisible", true);
            model.addAttribute("isEdit", false);
            model.addAttribute("formNews", new News());
        }

        return "newsmain";
    }

    // 뉴스 생성
    @PostMapping("/news/create")
    public String createNews(@ModelAttribute News news, Model model) {
        news.setCnt(0); // 조회수 초기화
        newsRepository.save(news);
        model.addAttribute("message", "뉴스가 성공적으로 등록되었습니다.");
        model.addAttribute("messageType", "success");
        return "redirect:/newsmain";
    }

    // 뉴스 수정
    @PostMapping("/news/edit")
    public String editNews(@ModelAttribute News news, Model model) {
        News existingNews = newsRepository.findById(news.getId()).orElse(null);
        if (existingNews != null) {
            existingNews.setTitle(news.getTitle());
            existingNews.setWriter(news.getWriter());
            existingNews.setContent(news.getContent());
            newsRepository.save(existingNews);
            model.addAttribute("message", "뉴스가 성공적으로 수정되었습니다.");
            model.addAttribute("messageType", "success");
        } else {
            model.addAttribute("message", "수정할 뉴스를 찾을 수 없습니다.");
            model.addAttribute("messageType", "danger");
        }
        return "redirect:/newsmain";
    }

    // 뉴스 삭제
    @PostMapping("/news/delete")
    public String deleteNews(@RequestParam("id") int id, Model model) {
        News existingNews = newsRepository.findById(id).orElse(null);
        if (existingNews != null) {
            newsRepository.delete(existingNews);
            model.addAttribute("message", "뉴스가 성공적으로 삭제되었습니다.");
            model.addAttribute("messageType", "success");
        } else {
            model.addAttribute("message", "삭제할 뉴스를 찾을 수 없습니다.");
            model.addAttribute("messageType", "danger");
        }
        return "redirect:/newsmain";
    }
}