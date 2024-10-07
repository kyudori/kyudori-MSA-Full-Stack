package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooTestApp {
	public static void main(String[] args) {
		ApplicationContext factory
    		= new ClassPathXmlApplicationContext("sample2.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		System.out.println("\nScope(singleton/prototype)");
		Foo ob1=(Foo)factory.getBean("foo0");
		System.out.println(ob1);
		Foo ob2=(Foo)factory.getBean("foo0");
		System.out.println(ob2);
		Foo ob3=(Foo)factory.getBean("foo0");
		System.out.println(ob3);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
