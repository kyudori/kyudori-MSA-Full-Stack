package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext factory =
				   new ClassPathXmlApplicationContext("sample7.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		Emp b1 = (Emp)factory.getBean("developer");
		System.out.println(b1.toString());
		
		Emp b2 = (Emp)factory.getBean("engineer");
		System.out.println(b2.toString());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
