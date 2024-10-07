package day9;

public class BookTest {
    public static void main(String[] args) {
//        Book book1 = new Book();
//        Book book2 = new Book("이것이 C다", "저자1", 10000);
//        Book book3 = new Book("이것이 C++이다", "저자2", 20000);
//        Book book4 = new Book("이것이 파이썬이다", "저자3", 30000);
//        Book book5 = new Book("이것이 R이다", "저자4", 40000);
//    	
//        System.out.print(book1.getBookInfo());
//        System.out.print(book2.getBookInfo());
//        System.out.print(book3.getBookInfo());
//        System.out.print(book4.getBookInfo());
//        System.out.print(book5.getBookInfo());
    	
    	Book[] ary = new Book[5];
    	
    	ary[0] = new Book();
    	ary[1] = new Book("이것이 C다", "저자1", 10000);
    	ary[2] = new Book("이것이 C++이다", "저자2", 20000);
    	ary[3] = new Book("이것이 파이썬이다", "저자3", 30000);
    	ary[4] = new Book("이것이 R이다", "저자4", 40000);

    	for (Book elem : ary)
    		System.out.println(elem.getBookInfo());
    }
}
