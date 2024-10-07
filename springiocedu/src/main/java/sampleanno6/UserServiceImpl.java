package sampleanno6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userService")   //기본값 : userServiceImpl
public class UserServiceImpl implements UserService{
	@Autowired	
	User member;

	@Override
	public void addUser() {
		System.out.println("Added member : " + member.getUserName());
	}
}
