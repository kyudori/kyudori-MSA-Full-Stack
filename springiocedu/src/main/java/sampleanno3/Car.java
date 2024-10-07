package sampleanno3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carTire") // 기본값 : car
public class Car {
	@Autowired(required = false) // default = true
	private Tire tire;

	public Car() {
		System.out.println("Car 객체 생성 - no args");
	}

	@Autowired(required = false)
	public Car(Tire tire) {
		System.out.println("Car 객체 생성 - "+tire);
	}

	public void drive() {
		if (tire != null)
			System.out.println("Nice made of "+tire.getBrand()+"s car.");
		else
			System.out.println("tire --> "+tire);
	}
}
