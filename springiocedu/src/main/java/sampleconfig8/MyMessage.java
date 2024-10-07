package sampleconfig8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  
public class MyMessage {
	@Autowired
	String message;
	
	public MyMessage(){
		System.out.println("MyMessage 객체 생성 - no args ");		
	}
	@Autowired
	public MyMessage(String m){
		System.out.println("MyMessage 객체 생성 - "+m);		
	}
	@Autowired
	//@Qualifier("message1")
	public void setMessage(String message) {
		System.out.println("MyMessage 객체의 setMessage() 호출 - "+message);
		this.message = message;
	}
	@Autowired
	//@Qualifier("message1")
	public void ccc(String message) {
		System.out.println("MyMessage 객체의 ccc() 호출 - "+message);
		this.message = message;
	}
	@Autowired
	//@Qualifier("message1")
	public void aaa(String message) {
		System.out.println("MyMessage 객체의 aaa() 호출 - "+message);
		this.message = message;
	}
	@Autowired
	//@Qualifier("message1")
	public void bbb(String message) {
		System.out.println("MyMessage 객체의 bbb() 호출 - "+message);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}	
}
