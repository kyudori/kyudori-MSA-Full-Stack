package day16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {
    public static void main(String[] args) {
        File directory = new File("c:/Temp");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directory, "event.txt");

        try (FileWriter writer = new FileWriter(file)) {
            LocalDate date1 = LocalDate.of(2024, 10, 3);
            LocalDate date2 = LocalDate.of(2024, 12, 25);

            String dayOfWeek1 = date1.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
            String dayOfWeek2 = date2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);

            writer.write(String.format("%d년 %d월 %d일은 %s요일입니다.\n", 2024, 10, 3, dayOfWeek1));
            writer.write(String.format("%d년 %d월 %d일은 %s요일입니다.\n", 2024, 12, 25, dayOfWeek2));

            System.out.println("저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
        }
    }
}
