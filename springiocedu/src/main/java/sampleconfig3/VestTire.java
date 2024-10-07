package sampleconfig3;

import org.springframework.stereotype.Component;
import sampleconfig3.Tire;

@Component // name = vestTire
public class VestTire implements Tire {

	public VestTire() {
		System.out.println("VestTire - Create object");
	}
	@Override
	public String getBrand() {
		return "MICHELIN Tire!!";
	}
}
