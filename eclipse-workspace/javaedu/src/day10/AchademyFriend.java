package day10;

public class AchademyFriend {
    static String academyName = "KOSA";
    private String name;
    private String color;
    private String hobby;
    private String food;

    public AchademyFriend(String name, String color, String hobby, String food) {
        this.name = name;
        this.color = color;
        this.hobby = hobby;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getHobby() {
        return hobby;
    }

    public String getFood() {
        return food;
    }
}
