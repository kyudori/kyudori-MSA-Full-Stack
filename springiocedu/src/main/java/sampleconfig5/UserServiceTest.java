package sampleconfig5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserServiceTest {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(MyConfiguration5.class);
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");

		UserService uu = factory.getBean("userService", UserService.class);
		uu.addUser();

		((AnnotationConfigApplicationContext) factory).close();

	}

}
