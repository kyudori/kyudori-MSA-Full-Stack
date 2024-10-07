package collection;

import java.util.Collections;
import java.util.LinkedList;

public class ProductTest2 {
    public static void main(String[] args) {
        LinkedList<Product2> productList = new LinkedList<>();
        
        productList.add(new Product2("p100", "TV", 20000));
        productList.add(new Product2("p200", "Computer", 10000));
        productList.add(new Product2("p100", "MP3", 700));
        productList.add(new Product2("p300", "Audio", 1000));

        System.out.print("정렬 전 데이터:");
        System.out.println("\n제품 ID     제품명   	가격");
        System.out.println("---------------------------------");
        printProducts(productList);

        Collections.sort(productList);
        System.out.print("\n정렬 후 데이터:");
        System.out.println("\n제품 ID     제품명   	가격");
        System.out.println("---------------------------------");
        printProducts(productList);
    }

    private static void printProducts(LinkedList<Product2> productList) {
        for (Product2 product : productList) {
            System.out.println(product);
        }
    }
}
