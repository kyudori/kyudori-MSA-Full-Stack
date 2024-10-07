package sampleconfig8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(MyConfiguration8.class);
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");

		MyMessage ob1=(MyMessage)factory.getBean("myMessage");
		System.out.println(ob1.getMessage() +"  "+ob1);
		
		MyMessage ob2=(MyMessage)factory.getBean("myMessage");
		System.out.println(ob2.getMessage() +"  "+ob2);
		
		(( AnnotationConfigApplicationContext)factory).close();
	}
}
