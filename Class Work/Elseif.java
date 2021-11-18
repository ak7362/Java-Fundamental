
/*Write a method to print Whether given is Positive or negitive or Zero */
import java.util.Scanner;

public class Elseif {
    static void ispositive(int n) {
        if (n > 0)
            System.out.println("Its Positive");
        else if (n < 0)
            System.out.println("Its negitive");
        else
            System.out.println("Its Zero");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        ispositive(n);
        sc.close();
    }
}
