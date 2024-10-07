package day12;

public class TimeTest { 
      public static void main(String[] args) { 
            Time t = new Time(12, 35, 30); 
            System.out.println(t); 
            t.hour = 30;
            System.out.println(t); 
            t.minute = -10;
            System.out.println(t); 
      } 
}
class Time { 
      int hour; 
      int minute; 
      int second; 
      Time(int hour, int minute, int second) { 
            this.hour = hour; 
            this.minute = minute; 
            this.second = second; 
      } 
      public String toString() { 
    	  return String.format("%d시 %d분 %d초", hour, minute, second); // System.out.printf() - 화면으로 출력
      } 
} 