package sampleconfig1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class FoodTest {
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(MyConfiguration1.class);
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");

		String[] beanNames = factory.getBeanDefinitionNames();
		// IOC 컨테이너에 등록된 Bean들의 이름 출력
		System.out.println(Arrays.toString(beanNames));
		
		MyFoodMgr ob=factory.getBean("myFood", MyFoodMgr.class);
		System.out.println(ob.toString());

		((AnnotationConfigApplicationContext) factory).close();
	}
}
