/*Program to find Greatest of two no. Using ternary operator */

import java.util.Scanner;

public class Greatest_number {
    static int greatestNumber(int x, int y) {
        int z = x > y ? x : y;
        return z;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = greatestNumber(a, b);
        System.out.println("Greatest number=" + c);
        sc.close();
    }
}
