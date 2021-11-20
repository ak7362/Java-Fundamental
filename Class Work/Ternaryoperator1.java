import java.util.Scanner;

public class Ternaryoperator1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d=(a > b) ? ((a > c) ? a : c) :((b > a) ? (b > c) ? b : c : c);
        System.out.println("Greatest number:" + d);
        sc.close();
    }
}
