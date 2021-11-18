/* Write a method to print whether given 2 number are same or not */

import java.util.Scanner;

public class Number_check {
    static void number_check(int a, int b) {
        if (a == b)
            System.out.println("Number is same");
        else
            System.out.println("Number is not same");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        number_check(a, b);
        sc.close();
    }
}
