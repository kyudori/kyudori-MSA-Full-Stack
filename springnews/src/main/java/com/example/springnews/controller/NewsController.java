package com.example.springnews.controller;

import com.example.springnews.model.Comment;
import com.example.springnews.model.News;
import com.example.springnews.repository.CommentRepository;
import com.example.springnews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private CommentRepository commentRepository;

    // 뉴스 메인 페이지
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
    @PostMapping("/insert")
    public String createNews(@ModelAttribute News news, Model model, RedirectAttributes redirectAttributes) {
        news.setCnt(0); // 조회수 초기화
        newsRepository.save(news);
        redirectAttributes.addFlashAttribute("message", "뉴스가 성공적으로 등록되었습니다.");
        redirectAttributes.addFlashAttribute("messageType", "success");
        return "redirect:/newsmain";
    }

    // 뉴스 수정
    @PostMapping("/update")
    public String editNews(@ModelAttribute News news, Model model, RedirectAttributes redirectAttributes) {
        News existingNews = newsRepository.findById(news.getId()).orElse(null);
        if (existingNews != null) {
            existingNews.setTitle(news.getTitle());
            existingNews.setWriter(news.getWriter());
            existingNews.setContent(news.getContent());
            newsRepository.save(existingNews);
            redirectAttributes.addFlashAttribute("message", "뉴스가 성공적으로 수정되었습니다.");
            redirectAttributes.addFlashAttribute("messageType", "success");
        } else {
            redirectAttributes.addFlashAttribute("message", "수정할 뉴스를 찾을 수 없습니다.");
            redirectAttributes.addFlashAttribute("messageType", "danger");
        }
        return "redirect:/newsmain";
    }

    // 뉴스 삭제
    @PostMapping("/delete")
    public String deleteNews(@RequestParam("id") int id, Model model, RedirectAttributes redirectAttributes) {
        News existingNews = newsRepository.findById(id).orElse(null);
        if (existingNews != null) {
            newsRepository.delete(existingNews);
            redirectAttributes.addFlashAttribute("message", "뉴스가 성공적으로 삭제되었습니다.");
            redirectAttributes.addFlashAttribute("messageType", "success");
        } else {
            redirectAttributes.addFlashAttribute("message", "삭제할 뉴스를 찾을 수 없습니다.");
            redirectAttributes.addFlashAttribute("messageType", "danger");
        }
        return "redirect:/newsmain";
    }

    // 댓글 생성
    @PostMapping("/comment/insert")
    public String createComment(@RequestParam("newsId") int newsId,
                                @ModelAttribute Comment comment,
                                RedirectAttributes redirectAttributes) {
        News selectedNews = newsRepository.findById(newsId).orElse(null);
        if (selectedNews != null) {
            comment.setNews(selectedNews);
            commentRepository.save(comment);
            redirectAttributes.addFlashAttribute("message", "댓글이 성공적으로 등록되었습니다.");
            redirectAttributes.addFlashAttribute("messageType", "success");
        } else {
            redirectAttributes.addFlashAttribute("message", "댓글을 작성할 뉴스를 찾을 수 없습니다.");
            redirectAttributes.addFlashAttribute("messageType", "danger");
        }
        return "redirect:/newsmain?id=" + newsId;
    }
}
