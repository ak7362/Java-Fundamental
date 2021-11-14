import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        // Pyramid Pattern
        System.out.println("1)Pyramid Pattern: ");
        System.out.print("Enter the number:");
        int n1 = sc.nextInt();
        for (i = 1; i < n1; i++) {
            for (j = 1; j < n1 - i; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        // //Reverse Pyramid
        System.out.println("2)Reverse Pyramid: ");
        System.out.print("Enter the number:");
        int n2 = sc.nextInt();
        for (i = n2; i >= 1; i--) {
            for (j = 1; j <= n2 - i; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        //Diamond Pattern
        System.out.println("3)Diamond Pattern:");
        System.out.print("Enter the number:");
        int n3 = sc.nextInt();
        for (i = 1; i < n3; i++) {
            for (j = 1; j <= n3 - i; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for (i = n3 - 1; i > 1; i--) {
            for (j = 1; j <= (n3 - i) - 1; j++)
                System.out.print(" ");
            System.out.print("  ");
            for (j = 1; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        // Reverse Pyramid With Number Pattern
        System.out.println("4)Reverse Pyramid With Number Pattern: ");
        System.out.println("Enter the number:");
        int n4 = sc.nextInt();
        int k = 1;
        for (i = n4; i >= 1; i--) {
            for (j = 1; j < n4 - i; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print(k + " ");
            k = k + 1;
            System.out.println();
        }

        int count = 0;
        for (i = n4; i >= 1; i--) {
            int c = 0;
            for (j = 1; j < n4 - i; j++)
                System.out.print(" ");
            for (k = 1; k <= i; k++) {
                c = count + k;
                System.out.print(c + " ");
            }
            count = count + 1;
            System.out.println();
        }

    }
}