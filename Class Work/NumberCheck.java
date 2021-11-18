
/*Write a program to check wheter given number is 10,20,30,40 or any of these */
import java.util.*;

public class NumberCheck {
    static void numbercheck(int a) {
        if (a == 10)
            System.out.println("Its is 10");
        else if (a == 20)
            System.out.println("Its is 20");
        else if (a == 30)
            System.out.println("Its is 30");
        else if (a == 40)
            System.out.println("Its is 40");
        else
            System.out.println("Not any of these ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numner:");
        int n = sc.nextInt();
        numbercheck(n);
        sc.close();
    }
}
