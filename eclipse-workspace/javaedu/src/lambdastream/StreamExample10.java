package lambdastream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample10 { 
	public static void main(String[] args) {
		List<Student2> totalList = new ArrayList<>();
		totalList.add(new Student2("둘리", "남", 92));
		totalList.add(new Student2("또치", "여", 87));
		totalList.add(new Student2("도우너", "남", 95));
		totalList.add(new Student2("희동이", "여", 93));

		// 남학생만 묶어 List 생성
		List<Student2> maleList = totalList.stream().filter(s -> s.getGender().equals("남")).collect(Collectors.toList());

		maleList.stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();

		// 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream().collect(Collectors.toMap(s -> s.getName(), // Student2 객체에서 키가 될
																									// 부분 리턴
				s -> s.getScore() // Student2 객체에서 값이 될 부분 리턴
		));

		System.out.println(map);
	}
}