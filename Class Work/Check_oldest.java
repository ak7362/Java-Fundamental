/* Write a method to take 3 person age and print who is oldest among 3 of these */

import java.util.Scanner;

public class Check_oldest {
    static void agecheck(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println("A is elder");
        else if (b > a && b > c)
            System.out.println("B is elder");
        else
            System.out.println("c is elder");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A person age:");
        int a = sc.nextInt();
        System.out.print("Enter B person age:");
        int b = sc.nextInt();
        System.out.print("Enter c person age:");
        int c = sc.nextInt();
        agecheck(a, b, c);
        sc.close();
    }
}
