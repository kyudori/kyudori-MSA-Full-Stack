package sampleconfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpTest {
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(MyConfiguration2.class);
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		Engineer my = factory.getBean("engineer", Engineer.class);
		System.out.println(my.toString());
		
		((AnnotationConfigApplicationContext) factory).close();
	}
}










