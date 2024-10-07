package day10;

public class AFTest {
    public static void main(String[] args) {
         
        AchademyFriend[] friends = new AchademyFriend[3];

        
        friends[0] = new AchademyFriend("지훈", "하늘색", "독서", "햄버거");
        friends[1] = new AchademyFriend("지용", "검은색", "잠자기", "리조또");
        friends[2] = new AchademyFriend("규현", "검은색", "야구시청", "치킨");

        for (AchademyFriend friend : friends) {
            System.out.println(friend.getName() + " 동료가 좋아하는 칼라는 " + friend.getColor() + "이며 취미는 " + friend.getHobby() + " 입니다. 그리고 제일 좋아하는 음식은 " + friend.getFood() + " 입니다. 지금은 " + AchademyFriend.academyName + "에서 학습하고 있어요.");
        }
    }
}
