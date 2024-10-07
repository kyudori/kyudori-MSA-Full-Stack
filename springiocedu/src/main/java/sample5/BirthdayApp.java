package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirthdayApp { 
	public static void main(String[] args) {
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("sample5.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		//DateVo ob1=(DateVo)factory.getBean("f1");
		DateVo ob1 = factory.getBean("f1", DateVo.class); //java.lang.Class 객첸
		System.out.println(ob1.toString());
			
		DateVo  ob2=factory.getBean("f2", DateVo.class);
		System.out.println(ob2.toString());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}






