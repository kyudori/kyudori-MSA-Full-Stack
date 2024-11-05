package com.example.springrestedu.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;*/
import com.example.springrestedu.exception.BookBoardNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import com.example.springrestedu.dto.BookBoard;

@Slf4j
@RestController
@RequestMapping("/bookboards")
@CrossOrigin(origins = "*")
public class BookBoardController {
	List<BookBoard> boardList = new ArrayList<>();
	public BookBoardController() {
		BookBoard board = new BookBoard();
		board.setBoardNo(1);
		board.setTitle("아기공룡 둘리 한자대탐험");
		board.setContent("둘리 학습만화 시리즈");
		board.setWriter("김수정");
		board.setRegDate(LocalDateTime.now());
		boardList.add(board);
		board = new BookBoard();
		board.setBoardNo(2);
		board.setTitle("고래 도서관");
		board.setContent("바다 도서관 이야기");
		board.setWriter("지드루");
		board.setRegDate(LocalDateTime.now());
		boardList.add(board);
		board = new BookBoard();
		board.setBoardNo(3);
		board.setTitle("그리다가, 뭉클");
		board.setContent("매일이 특별해지는 순간의 기록");
		board.setWriter("이기주");
		board.setRegDate(LocalDateTime.now());
		boardList.add(board);
	}
	@GetMapping
	public ResponseEntity<List<BookBoard>> list() {
		log.info("list 요청");

		ResponseEntity<List<BookBoard>> entity = new ResponseEntity<>(boardList, HttpStatus.OK);

		return entity;
	}

	@PostMapping
	public ResponseEntity<String> register(@RequestBody BookBoard board) {
		log.info("register 요청");
		boardList.add(board);
		ResponseEntity<String> entity = new ResponseEntity<>("성공적으로 삽입했어용", HttpStatus.CREATED);

		return entity;
	}
	@GetMapping("/{boardNo}")
	public ResponseEntity<BookBoard> read(@PathVariable("boardNo") int boardNo) {
		log.info("read 요청");

		BookBoard board = new BookBoard();
		board.setBoardNo(boardNo);
	 	int index = boardList.indexOf(board);
		if (index >= 0)
			 board = boardList.get(index);

		ResponseEntity<BookBoard> entity = new ResponseEntity<>(board, HttpStatus.OK);

		return entity;
	}

	@GetMapping("/v2/{boardNo}")
	public ResponseEntity<BookBoard> read2(@PathVariable("boardNo") int boardNo) {
		log.info("read 요청");
		BookBoard board = new BookBoard();
		board.setBoardNo(boardNo);
		int index = boardList.indexOf(board);
		if (index >= 0)
			board = boardList.get(index);
		else
			throw new BookBoardNotFoundException(String.format("[%s]번 글은 존재하지 않아요...", boardNo));

		ResponseEntity<BookBoard> entity = new ResponseEntity<>(board, HttpStatus.OK);

		return entity;
	}

	@DeleteMapping("/{boardNo}")
	public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo) {
		log.info("remove 요청");
		BookBoard board = new BookBoard();
		board.setBoardNo(boardNo);
		boardList.remove(board);

		ResponseEntity<String> entity = new ResponseEntity<>("성공적으로 삭제했어용", HttpStatus.OK);

		return entity;
	}

	@PutMapping("/{boardNo}")
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody BookBoard board) {
		log.info("modify 요청");
		BookBoard board1 = new BookBoard();
		board1.setBoardNo(boardNo);
		int index = boardList.indexOf(board1);
		if (index >= 0)
			board1 = boardList.get(index);
		board1.setWriter(board.getWriter());
		board1.setContent(board.getContent());
		board1.setTitle(board.getTitle());
		board1.setRegDate(board.getRegDate());

		ResponseEntity<String> entity =
				new ResponseEntity<>("성공적으로 수정했어용", HttpStatus.OK);
		return entity;
	}
}
