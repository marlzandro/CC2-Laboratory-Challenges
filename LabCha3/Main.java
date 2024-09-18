//Programmer: Marl Zandro T. Andaya
//Sep 12, 2024
//Laboratory Challenge No. 3: Grocery Shopping Calculator
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of the 1st Item: ");
        int item1 = scan.nextInt();
        System.out.print("Enter the quantity of the 1st Item: ");
        int quantity1 = scan.nextInt();

        System.out.print("Enter the price of the 2nd Item: ");
        int item2 = scan.nextInt();
        System.out.print("Enter the quantity of the 2nd Item: ");
        int quantity2 = scan.nextInt();

        System.out.print("Enter the price of the 3rd Item: ");
        int item3 = scan.nextInt();
        System.out.print("Enter the quantity of the 3rd Item: ");
        int quantity3 = scan.nextInt();

        double price1 = item1*quantity1;
        double price2 = item2*quantity2;
        double price3 = item3*quantity3;
        double subTotal = price1 + price2 + price3;
        double disCount = 0.05 * subTotal;
        double dissales = subTotal - disCount;
        double salesTax = dissales * 0.12;
        double finalTotal = dissales + salesTax;

        System.out.println("\nSubtotal : PHP " + subTotal);
        System.out.println("Discount : PHP " + disCount);
        System.out.println("Sales Tax : PHP " +salesTax);
        System.out.println("Final Total : PHP " +finalTotal);
    }
    
}
