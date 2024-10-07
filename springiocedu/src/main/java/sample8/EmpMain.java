package sample8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext factory =
				   new ClassPathXmlApplicationContext("sample8.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		Developer b1 = (Developer)factory.getBean("developer");
		System.out.println(b1.toString());
		
		Engineer b2 = (Engineer)factory.getBean("engineer");
		System.out.println(b2.toString());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
