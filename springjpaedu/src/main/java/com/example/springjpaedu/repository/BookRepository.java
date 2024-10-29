package com.example.springjpaedu.repository;

import com.example.springjpaedu.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // 전체 도서의 리스트를 리턴하는 메서드
    // ListCrudRepository findAll();

    // 전달된 id 와 동일한 id 를 갖는 도서를 리턴하는 메서드
    // ListCrudRepository findAllById();

    // 가격이 높은 순으로 도서 리스트를 리턴하는 메서드
    List<Book> findAllByOrderByPriceDesc();

    // 전달된 가격과 동일하거나 더 비싼 도서 리스트를 리턴하는 메서드
    List<Book> findByPriceGreaterThanEqual(int price);

    // 전달된 분류 정보와 동일한 도서 리스트를 리턴하는 메서드
    List<Book> findByKind(String kind);

    // 도서 제목이 전달된 아규먼트 값으로 시작하는 도서 리스트를 리턴하는 메서드
    List<Book> findByTitleStartingWith(String prefix);

    // 전달된 두 개의 아규먼트 중 하나를 도서 제목에 포함하는 도서 리스트를 리턴하는 메서드
    List<Book> findByTitleContainingOrTitleContaining(String title1, String title2);

    // 가격이 가장 싼 도서를 리턴하는 메서드
    @Query("SELECT b FROM Book b WHERE b.price = (SELECT MIN(b2.price) FROM Book b2)")
    List<Book> findCheapestBook();

    // 전체 도서의 개수를 리턴하는 메서드
    // CrudRepository long count();

    // 전달된 분류 정보에 속하는 도서의 개수를 리턴하는 메서드
    long countByKind(String kind);

    // 분류별 도서 가격의 평균을 리턴하는 메서드
    @Query("SELECT AVG(b.price) FROM Book b GROUP BY b.kind")
    List<Integer> findAveragePriceByKind();

//    // 분류별 도서 가격의 평균을 리턴하는 메서드
//    @Query("SELECT AVG(b.price) FROM Book b WHERE b.kind = :kind")
//    Double findAveragePriceByKind(@Param("kind") String kind);
}
