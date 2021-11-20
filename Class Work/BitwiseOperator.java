import java.util.Scanner;

class BitwiseOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int c = a >> 1;
        int d = a << 1;
        System.out.println("Right shift:" + c);
        System.out.println("Left shift:" + d);
        System.out.println("Left shift:" + (a<<2));
        System.out.println("a>>>2=" + (a>>>2));
        System.out.println("~a="+(~a));

        System.out.print("Enter two number:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("x & y=" + (x& y));        
        System.out.println("x | y=" + (x | y));        
        System.out.println("x ^ y=" + (x ^ y));
        sc.close();
    }
}
