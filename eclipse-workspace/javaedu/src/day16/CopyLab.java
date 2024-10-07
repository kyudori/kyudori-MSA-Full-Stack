package day16;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CopyLab {
    public static void main(String[] args) {
        File inputFile = new File("C:\\education\\eclipse-workspace\\javaedu\\src\\day16\\sample.txt");

        if (!inputFile.exists()) {
            System.out.println("sample.txt 파일을 찾을 수 없습니다.");
            return;
        }

        LocalDate now = LocalDate.now();
        String formattedDate = now.format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));
        File outputFile = new File("c:/iotest/sample_" + formattedDate + ".txt");

        File directory = new File("c:/iotest");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("저장 완료되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("sample.txt 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
        }
    }
}
