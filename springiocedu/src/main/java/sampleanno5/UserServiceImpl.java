package sampleanno5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	@Qualifier("myUser")
	User member;
	
	public void setMember(User member) {
		this.member = member;
		System.out.println("setMember() 기 호출될까요?");
	}
	@Override
	public void addUser() {
		System.out.println("Added member : " + member.getUserName());
	}
}

















