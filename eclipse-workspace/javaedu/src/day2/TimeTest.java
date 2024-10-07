package day2;

public class TimeTest {
    public static void main(String[] args) {
        int time = 32150;
        
        int hours = time / 3600;            
        int minutes = (time % 3600) / 60;   
        int seconds = time % 60;            
        
        System.out.printf("%d시간 %d분 %d초\n", hours, minutes, seconds);
    }
}
