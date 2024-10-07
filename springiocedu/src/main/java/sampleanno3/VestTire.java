package sampleanno3;

import org.springframework.stereotype.Component;

@Component // name = vestTire
public class VestTire implements Tire{

	public VestTire() {
		System.out.println("VestTire - Create object");
	}
	@Override
	public String getBrand() {
		return "MICHELIN Tire!!";
	}
}
