package sample5;
public class DateVo {
	private String name;
	private String birth;
		
	public DateVo() {
		super();
		System.out.println("IoC 컨테이너에 의해 DateVO 객체 생성");
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("IoC 컨테이너에 의해 setName("+name+") 호출");
	}
	public void setBirth(String birth) {
		this.birth = birth;
		System.out.println("IoC 컨테이너에 의해 setBirth("+birth+") 호출");
	}
	@Override
	public String toString() {
		return name + "의 생일 : " + birth;
	}
}
