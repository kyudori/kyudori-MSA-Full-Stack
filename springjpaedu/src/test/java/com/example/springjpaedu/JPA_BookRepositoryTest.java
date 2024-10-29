package com.example.springjpaedu;

import com.example.springjpaedu.entity.Book;
import com.example.springjpaedu.repository.BookRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
public class JPA_BookRepositoryTest {
    @Autowired
    private BookRepository bookR;

    @BeforeEach
    void pr() {
        System.out.println("==========================================================");
    }

    @Test
    @Order(1)
    void list() {
        List<Book> list = bookR.findAll();
        list.stream().forEach(System.out::println);
    }

    @Test
    @Order(2)
    void findAllByOrderByPriceDesc(){
        List<Book> list = bookR.findAllByOrderByPriceDesc();
        list.stream().forEach(System.out::println);
    }

    @Test
    @Order(3)
    void findByPriceGreaterThanEqual_20000() {
        List<Book> list = bookR.findByPriceGreaterThanEqual(20000);
        list.stream().forEach(System.out::println);
    }
    @Test
    @Order(4)
    void byId() {
        Optional<Book> list = bookR.findById(10);
        if(list.isPresent()){
            list.stream().forEach(System.out::println);
        }
        else{
            System.out.println("***********존재하지 않음!!************");
        }
    }

    @Test
    @Order(5)
    void byTitleContainingOrTitleContaining() {
        List<Book> list = bookR.findByTitleContainingOrTitleContaining("자바", "도커");
        list.stream().forEach(System.out::println);
    }

    //분류별 도서가격 평균을 리턴하는 메서드를 호출하고 엔티티 객체들을 표준 출력한다.
    @Test
    @Order(6)
    void findAveragePriceByKind() {
        List<Integer> avePrice = bookR.findAveragePriceByKind();
        avePrice.stream().forEach(System.out::println);
    }

//    //분류별 도서가격 평균을 리턴하는 메서드를 호출하고 엔티티 객체들을 표준 출력한다.
//    @Test
//    @Order(6)
//    void findAveragePriceByKind() {
//        String kind = "b001";
//        Double avgPrice1 = bookR.findAveragePriceByKind(kind);
//        System.out.println(avgPrice1);
//
//        List<Book> list = bookR.findByKind(kind);
//        list.stream().forEach(System.out::println);
//
//        kind = "b002";
//        Double avgPrice2 = bookR.findAveragePriceByKind(kind);
//        System.out.println(avgPrice2);
//        list = bookR.findByKind(kind);
//        list.stream().forEach(System.out::println);
//    }

    @Test
    @Order(7)
    void byCheapestBook(){
        List<Book> list = bookR.findCheapestBook();
        System.out.println(list);
    }

    @Test
    @Order(8)
    void count(){
        System.out.println("전체 도서의 수: "+bookR.count()+"권");
    }

    @Test
    @Order(9)
    void countByKind(){
        System.out.println("b02 부류의 도서는 "+ bookR.countByKind("b02")+"권");
    }

    @Test
    @Order(10)
    void findByTitleStartingWith(){
        List<Book> list = bookR.findByTitleStartingWith("모던");
        list.stream().forEach(System.out::println);
    }
}
