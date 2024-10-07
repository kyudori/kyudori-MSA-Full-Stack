package sampleconfig1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import sampleconfig1.Food;

@Component("myFood")  //default : myFoodMgr
public class MyFoodMgr{
	@Autowired
	private Food favoriteFood;
	@Autowired
	private Food unFavoriteFood;

	public MyFoodMgr() {
		System.out.println("MyFoodMgr 객체 생성");
	}
	                 
	
	@Override
	public String toString() {
		return "[favoriteFood=" + favoriteFood + ", unFavoriteFood=" + unFavoriteFood + "]";
	}
}
