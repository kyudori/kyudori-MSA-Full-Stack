package day11;

class Friend extends Person {
    private String phoneNum;
    private String email;

    Friend(String name, String phoneNum, String email) {
        super(name);
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getInfo() {
        return super.getInfo() + "   " + phoneNum + "   " + email;
    }
}

public class FriendTest {

	public static void main(String[] args) {
		Friend friends[] = new Friend[5];
		
        friends[0] = new Friend("홍길동", "010-1234-1234", "hong@naver.com");
        friends[1] = new Friend("김철수", "010-4321-4321", "chul@naver.com");
        friends[2] = new Friend("김영희", "010-5678-8765", "hee@naver.com");
        friends[3] = new Friend("동길홍", "010-2222-2222", "dong@naver.com");
        friends[4] = new Friend("수철김", "010-3333-3333", "kim@naver.com");
        
        System.out.println("이름    전화번호          메일주소");
		System.out.println("-".repeat(30));
		for(Friend friend : friends) {
			System.out.println(friend.getInfo());
		}
	}

}
