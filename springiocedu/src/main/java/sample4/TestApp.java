package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		AbstractTest bean = (AbstractTest) factory.getBean("test");
		System.out.println("Today : " + bean.dayInfo());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
