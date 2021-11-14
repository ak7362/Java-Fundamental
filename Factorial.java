import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
// For Loop

        int fact = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Using For Loop: ");
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        System.out.println();

// While Loop
        System.out.println("Using While Loop: ");
        System.out.print("Enter the number: ");
        int n2 = sc.nextInt();
        int j = 1, factorial = 1;
        while (j <= n2) {
            factorial = factorial * j;
            j++;
        }
        System.out.println("Factorial of " + n2 + " is " + factorial);

    }
}
