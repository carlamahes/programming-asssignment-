import java.util.Scanner;
import java.lang.Math;

public class invoice {
    public static void main(String[] args) {
        System.out.println("ES Companies Portal - Cashier App");
        System.out.println("=======================================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input item's name :");
        String item = scanner.nextLine();

        System.out.println("Input item's price [use decimal numbers]: ");
        Double price = scanner.nextDouble();

        System.out.println("Input item's quantity [1..20] :");
        int quantity = scanner.nextInt();
    
        System.out.println("Input item's discount [0..50] : ");
        int discount = scanner.nextInt();

        System.out.println("\nES Companies Portal - Invoice ");
        System.out.println("===================================");

        Scanner n = new Scanner(System.in);
        n.nextLine();

        System.out.println("Item's name :" +item);
        System.out.println("Item's price :"+price);
        System.out.println("Item's quantity :"+quantity);
        System.out.println("Item's discount :"+discount);


        Double totalPrize = price*quantity*(100-discount)/100;

        double rounded = Math.round(totalPrize*100);
        System.out.println("\nYou have to pay $"+rounded);
    
        scanner.close();

    }
}
