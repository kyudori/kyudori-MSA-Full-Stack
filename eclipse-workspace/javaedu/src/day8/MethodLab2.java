package day8;

public class MethodLab2 {

    public static void main(String[] args) {
        System.out.println(getUpper('a'));
        System.out.println(getUpper('A'));
        System.out.println(getUpper('z'));
        System.out.println(getUpper('!'));
        System.out.println(getUpper('w'));
    }
    
    public static char getUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 'a' + 'A');
        } else {
            return '@';
        }
    }
}
