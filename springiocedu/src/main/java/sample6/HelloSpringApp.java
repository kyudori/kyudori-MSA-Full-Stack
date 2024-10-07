package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		ApplicationContext factory
        		= new ClassPathXmlApplicationContext("sample6.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");

		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.helloCall();

		((ClassPathXmlApplicationContext) factory).close();
	}
}
