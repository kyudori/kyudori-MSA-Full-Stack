package sampleanno3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCar {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("sampleanno3.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		Car tire2=factory.getBean("carTire", Car.class);
		tire2.drive();
		/*
		 * Tire tire=factory.getBean("vestTire", Tire.class);
		 * System.out.println(tire.getBrand());
		 */
		((ClassPathXmlApplicationContext)factory).close();	
	}
}








