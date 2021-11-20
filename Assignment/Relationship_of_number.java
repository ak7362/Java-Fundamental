/*Write a method which takes 2 number as input and prints their relationship */

import java.util.Scanner;

public class Relationship_of_number {
    void relationwithnumber(int x, int y) {
        if (x > y)
            System.out.println(x + " is greater");
        else if (x < y)
            System.out.println(y + " is greater");
        else
            System.out.println("Both the number is equal");
    }

    public static void main(String args[]) {
        Relationship_of_number n1 = new Relationship_of_number();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        n1.relationwithnumber(a, b);
        sc.close();
    }
}
