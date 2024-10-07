package sampleanno4;

import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("SAMSUNG TV - Power On");
	}

	@Override
	public void powerOff() {
		System.out.println("SAMSUNG TV - Power Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("SAMSUNG TV - Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SAMSUNG TV - Volume Down");
	}

}
