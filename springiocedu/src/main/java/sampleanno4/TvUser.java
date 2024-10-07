package sampleanno4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TvUser {
	public static void main(String[] args) {
		ApplicationContext factory
		        = new ClassPathXmlApplicationContext("sampleanno4.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		System.out.print("사용하려는 빈객체의 이름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		String beanName = scan.nextLine();
	
		Tv tv=(Tv)factory.getBean(beanName);   //samsung or lg
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		scan.close();
		((ClassPathXmlApplicationContext)factory).close();
	}
}
