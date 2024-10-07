package sampleanno5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myUser")
public class User {
	@Autowired
	private String userName;

	public User() {
		super();
	}

	public User(String userName) {
		super();
		this.userName = userName;      
	}

	public String getUserName() {
		return userName;
	}
}
