package collection;

import java.util.Objects;

public class Product {
    private String productID;
    private String productName;
    private int productPrice;

    public Product(String productID, String productName, int productPrice) {
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
		Product other = (Product) obj;
		return Objects.equals(productID, other.productID);
	}

    public int hashCode() {
        return Objects.hash(productID);
    }

    public String toString() {
        return String.format("%-10s %-10s %d", productID, productName, productPrice);
    }
}
