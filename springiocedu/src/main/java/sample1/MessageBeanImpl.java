package sample1;

public class MessageBeanImpl implements MessageBean{
	private String fruit;
	private int cost;	
	public MessageBeanImpl() {
		super();
		System.out.println("MessageBeanImpl Default Constructor Call");
	}
	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println(fruit + " :  MessageBeanImpl 생성자 메서드 호출");
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setCost() 호출");
	}

	@Override
	public void sayHello() {      
		System.out.println(fruit + " : " + cost);
	}

	@Override                     
	public void sayHello(String fruit, int cost) {   
		System.out.println(fruit + " : " + cost);
	}
}






