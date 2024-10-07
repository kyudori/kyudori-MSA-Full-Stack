package day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTest3 {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.printf("%tY년\n", d);
		System.out.printf("%tm월\n", d);
		System.out.printf("%td일\n", d);		
		System.out.printf("%tY년 %1$tm월 %1$td일\n", d);
		System.out.printf("%tY년 %1$tb %1$te일\n", d);
		
		System.out.printf("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초\n", d);
		System.out.printf("%tT\n", d);	
		System.out.printf("%tD\n", d);	
		
		System.out.printf("%tY년 %1$tm월 %1$td일\n", LocalDate.now());
		System.out.printf("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초\n", LocalDateTime.now());
		System.out.printf("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초\n", new GregorianCalendar());
	}
}







