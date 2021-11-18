import java.util.Scanner;

public class MaxNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
            System.out.println("Maximun:" + a);
        else
            System.out.println("Maximum:" + b);

        sc.close();
    }

}
