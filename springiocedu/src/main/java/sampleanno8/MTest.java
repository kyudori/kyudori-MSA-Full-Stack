package sampleanno8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("sampleanno8.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");

		MyMessage ob1=(MyMessage)factory.getBean("myMessage");
		System.out.println(ob1.getMessage() +"  "+ob1);
		
		MyMessage ob2=(MyMessage)factory.getBean("myMessage");
		System.out.println(ob2.getMessage() +"  "+ob2);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
