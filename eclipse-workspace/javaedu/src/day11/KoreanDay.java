package day11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KoreanDay {
	public static String day ;
	static String korDayName[] = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
	static {
		// System.out.println("클래스 로딩시 static 블록이 수행됨~~");
		GregorianCalendar cal = new GregorianCalendar();
		int numDay = cal.get(Calendar.DAY_OF_WEEK);
		day = korDayName[numDay];
	}
}
