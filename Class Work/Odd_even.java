
/* Program to find if a number is odd or even */
import java.util.Scanner;

public class Odd_even {
    public static void odd_even(int a) {
        if (a % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("odd number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        odd_even(n);
        sc.close();
    }

}
