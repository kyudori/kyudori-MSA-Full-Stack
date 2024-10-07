package collection;

import java.text.DecimalFormat;
import java.util.Objects;

public class Product2 implements Comparable<Product2> {
    private String productID;
    private String productName;
    private int productPrice;

    public Product2(String productID, String productName, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product2 other = (Product2) obj;
        return Objects.equals(productID, other.productID);
    }

    public int hashCode() {
        return Objects.hash(productID);
    }

    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return String.format("%-10s %-10s %s원", productID, productName, formatter.format(productPrice));
    }

    //Comparable의 compareTo(T o) 메소드는 파라미터(매개변수)가 한 개
    //Comparator의 compare(T o1, T o2) 메소드는 파라미터가 두 개
    public int compareTo(Product2 p) {
        //return Integer.compare(this.productPrice, p.productPrice);
        if (this.productPrice > p.productPrice) {
        	return 1 * -1;
        } else if (this.productPrice < p.productPrice) {
        	return -1 * -1;
        } else {
        	return 0;
        }
    }
}
