package day16;

import java.io.*;

public class CountLab {
    public static void main(String[] args) {
        File inputFile = new File("C:\\education\\eclipse-workspace\\javaedu\\src\\day16\\yesterday.txt");

        if (!inputFile.exists()) {
            System.out.println("yesterday.txt 파일을 찾을 수 없습니다.");
            return;
        }

        int count = 0;
        String targetWord = "yesterday";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                int index = 0;

                while ((index = line.indexOf(targetWord, index)) != -1) {
                    count++;
                    index += targetWord.length();
                }
            }

            System.out.printf("\"%s\" 라는 단어는 %d개 있습니다.%n", targetWord, count);
        } catch (IOException e) {
            System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
        }
    }
}
