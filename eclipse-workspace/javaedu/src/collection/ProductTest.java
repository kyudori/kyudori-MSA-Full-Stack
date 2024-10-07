package collection;

import java.util.HashSet;

public class ProductTest {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();
        
        addProduct(productSet, new Product("p100", "TV", 20000));
        addProduct(productSet, new Product("p200", "Computer", 10000));
        addProduct(productSet, new Product("p100", "MP3", 700));
        addProduct(productSet, new Product("p300", "Audio", 1000));

        System.out.println("\n제품 ID       제품명       가격");
        System.out.println("---------------------------------------------------------");
        for (Product product : productSet) {
            System.out.println(product);
        }
    }

    private static void addProduct(HashSet<Product> productSet, Product product) {
        if (productSet.add(product)) {
        //public boolean add(E e) 
        //Adds the specified element to this set if it is not already present. More formally, adds the specified element e to this set if this set contains no element e2 such that Objects.equals(e, e2). 
        //If this set already contains the element, the call leaves the set unchanged and returns false.
        	System.out.println("성공적으로 저장되었습니다.");
        } else {
            System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
        }
    }
}
