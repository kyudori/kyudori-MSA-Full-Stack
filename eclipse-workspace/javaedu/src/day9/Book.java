package day9;

public class Book {
    String title;
    String author;
    int price;

    Book() {
        this.title = "이것이 자바다";
    }

    Book(String title, String author, int price) {
    	super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getBookInfo() {
        return title + " " + author + " " + price + "\n";
    }
}