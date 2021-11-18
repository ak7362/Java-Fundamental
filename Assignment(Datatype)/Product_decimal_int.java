package Assignment;

import java.util.Scanner;

public class Product_decimal_int {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Decimal Number: ");
        Double d = sc.nextDouble();
        Double p = a * d;
        System.out.println("Product of Int and Decimal number: " + p);
        sc.close();
    }
}
