/* write a method which takes 2 number and 1 char(operation +,-,*,/,%)and performs the operation and returna the ans */

import java.util.Scanner;

public class Operator {
    static float operation(float a, float b, char c) {
        if (c == '+')
            return a + b;
        else if (c == '-')
            return a - b;
        else if (c == '*')
            return a * b;
        else if (c == '/')
            return a / b;
        else if (c == '%')
            return a % b;

        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.print("Enter what you do: Adding(i.e +),Sub(-),mul(*),div(/),modulus(%):");
        char c = sc.next().charAt(0);
        float d = operation(a, b, c);
        System.out.printf("%.2f %c %.2f= %.2f", a, c, b, d);
        sc.close();
    }
}
