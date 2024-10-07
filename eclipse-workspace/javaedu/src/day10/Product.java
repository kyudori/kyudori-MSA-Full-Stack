package day10;

public class Product {
	String name;
	int balance;
	int price;
	
	Product(){
		this.name = "듀크인형";
		this.balance = 5;
		this.price = 10000;
	}
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    int getPrice() {
        return price;
    }
}
