package model.domain;

public class MemberVO {
	private String name;
	private String phone;
	private String id;
	private String pwd;	

	public MemberVO(String name, String phone, String id, String pwd) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}
}
