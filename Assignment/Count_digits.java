/*Program to calculate no. of digits in a number using while loop */

import java.util.Scanner;

public class Count_digits {

    int countDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        long n = sc.nextLong();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        sc.close();
        return count;
    }

    public static void main(String args[]) {
        Count_digits c1 = new Count_digits();
        int count = c1.countDigits();
        System.out.println(count + " digits number");
    }

}
