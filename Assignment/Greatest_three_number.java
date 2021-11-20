/*Program to find greatest of three no. using ternary operation */

import java.util.Scanner;

public class Greatest_three_number {

    int greatestThreeNumber(int p, int q, int r) {
        int s = (p > q) ? ((p > r) ? p : r) : ((q > p) ? ((q > r) ? q : r) : r);
        return s;
    }

    public static void main(String args[]) {
        Greatest_three_number g1 = new Greatest_three_number();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = g1.greatestThreeNumber(a, b, c);
        System.out.println("Greatest number=" + d);
        sc.close();
    }
}
