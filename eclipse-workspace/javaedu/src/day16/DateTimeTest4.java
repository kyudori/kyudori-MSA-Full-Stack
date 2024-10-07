package day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTest4 {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		String s1 = String.format("%tY년", d);
		String s2 = String.format("%tm월", d);
		String s3 = String.format("%td일", d);		
		String s4 = String.format("%tY년 %1$tm월 %1$td일", d);
		String s5 = String.format("%tY년 %1$tb %1$te일", d);
		String s6 = String.format("%tY_%1$tm_%1$td", d);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6+"\n");
		
		String s7 = String.format("%tY년 %1$tm월 %1$td일", LocalDate.now());
		String s8 = String.format("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초", LocalDateTime.now());
		String s9 = String.format("%tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초", new GregorianCalendar());
		
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
	}
}







