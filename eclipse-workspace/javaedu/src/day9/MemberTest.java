package day9;

public class MemberTest {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();
        member1.name = "이름1";
        member1.account = "acc1";
        member1.passwd = "pw1";
        member1.birthyear = 1999;
        member2.name = "이름2";
        member2.account = "acc2";
        member2.passwd = "pw2";
        member2.birthyear = 2001;
        member3.name = "이름3";
        member3.account = "acc3";
        member3.passwd = "pw3";
        member3.birthyear = 2000;
        
        System.out.println("회원1: " + member1.name + "(" + member1.account + "," + member1.passwd + "," + member1.birthyear + ")");
        System.out.println("회원2: " + member2.name + "(" + member2.account + "," + member2.passwd + "," + member2.birthyear + ")");
        System.out.println("회원3: " + member3.name + "(" + member3.account + "," + member3.passwd + "," + member3.birthyear + ")");
    }
}
