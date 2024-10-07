package sampleanno4;

import org.springframework.stereotype.Component;

@Component("lg") 
public class LgTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("LG TV - Power On");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV - Power Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV - Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV - Volume Down");
	}

}
