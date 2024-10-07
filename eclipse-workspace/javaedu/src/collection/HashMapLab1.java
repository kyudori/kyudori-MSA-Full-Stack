package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapLab1 {
    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulationMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (countryPopulationMap.size() < 5) {
            System.out.print("나라이름을 입력하세요: ");
            String country = scanner.nextLine();
            if (countryPopulationMap.containsKey(country)) {
                System.out.println("나라명 " + country + "는 이미 저장되었습니다.");
                continue;
            }

            System.out.print("인구 수를 입력하세요: ");
            int population = Integer.parseInt(scanner.nextLine());

            countryPopulationMap.put(country, population);
            System.out.println("*저장되었습니다.*");
        }

        System.out.println("5개가 모두 입력되었습니다.");
        System.out.print("입력된 데이터: ");

        Iterator<Map.Entry<String, Integer>> iterator = countryPopulationMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        scanner.close();
    }
}
