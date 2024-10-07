package day16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest2 {
	public static void main(String[] args) throws Exception {
		Long time = new Date().getTime();
		System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(time));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(time));
		Date d = sdf.parse("2025년 01월 01일");
		System.out.println(d);	
	}	
}







