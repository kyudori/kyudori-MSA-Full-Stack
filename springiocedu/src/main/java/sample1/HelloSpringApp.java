package sample1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringApp {
	public static void main(String[] args) {
		ApplicationContext factory
		    	= new ClassPathXmlApplicationContext("sample1.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		MessageBean bean1=(MessageBean)factory.getBean("messageBean1");
		bean1.sayHello();                 
		bean1.sayHello("banana", 1500);   
		System.out.println(bean1);
		System.out.println(factory.getBean("messageBean1"));
		System.out.println(factory.getBean("messageBean1"));
				
		MessageBean bean2=(MessageBean)factory.getBean("messageBean2");
		bean2.sayHello();                 
		bean2.sayHello("banana", 1500); 
		System.out.println(bean2);
		((ClassPathXmlApplicationContext)factory).close();
	}
}





