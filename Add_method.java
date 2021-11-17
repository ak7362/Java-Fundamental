import java.util.Scanner;

public class Add_method{
    public int add(int x, int y) {
        return  x + y;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Add_method f1 = new Add_method();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        int c = f1.add(a, b);
        System.out.println("sum of two number is " + c);
        sc.close();
    }
}
