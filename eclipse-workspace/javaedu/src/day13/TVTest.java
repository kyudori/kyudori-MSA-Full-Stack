package day13;

public class TVTest {
    public static void main(String[] args) {
    	
        SaleTV saleTV = new SaleTV("SALETV-1", 40, 1, 300000);
        saleTV.channelUp();
        saleTV.channelUp();

        RentalTV rentalTV = new RentalTV("RENTALTV-10", 42, 1, 100000);
        rentalTV.channelDown();
        rentalTV.channelDown();
        rentalTV.channelDown();

        printAllTV(saleTV);
        printAllTV(rentalTV);

        printRentalTV(rentalTV);
    }

    static void printAllTV(TV tv) {
        System.out.println(tv.toString());

        if (tv instanceof SaleTV) {
            ((SaleTV) tv).play();
            ((SaleTV) tv).sale();
        }
        else {
            ((RentalTV) tv).play();
        }
    }

    static void printRentalTV(Rentable tv) {
        tv.rent();
    }
}

