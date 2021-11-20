/* Write a method which takes 2 numbers and 1 char (operation +,-,*,/,%) */

import java.util.Scanner;

public class AssignmentOperator {

    void operation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two number:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.print("Enter what you do: Adding(i.e +),Sub(-),mul(*),div(/),modulus(%):");
        char c = sc.next().charAt(0);
        switch (c) {
        case '+':
            System.out.format("Adding of %.3f + %.3f is %.3f\n", a, b, a + b);
            break;

        case '-':
            System.out.printf("Subtraction of %.3f - %.3f is %.3f\n", a, b, a - b);
            break;
        case '*':
            System.out.printf("Multiplication of %.3f * %.3f is %.3f\n", a, b, a * b);
            break;
        case '/':
            System.out.printf("Dividing of %.3f / %.3f= %.3f\n", a, b, a / b);
            break;
        case '%':
            System.out.printf("Modulus of %.3f %% %.3f is %.3f\n", a, b, a % b);
            break;
        default:
            System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only.");

        }
        sc.close();
    }

    public static void main(String args[]) {
        AssignmentOperator a1 = new AssignmentOperator();
        a1.operation();
    }
}
