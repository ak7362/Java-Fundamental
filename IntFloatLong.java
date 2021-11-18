import java.util.Scanner;

public class IntFloatLong {
    static int Int_multiplication(int x, int y) {
        return x * y;
    }

    static float Float_multiplication(float x, float y) {
        return x * y;
    }

    static long Long_multiplication(long x, long y) {
        return x * y;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Integer number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Int_multiplication(a, b);
        System.out.printf("multiplication of %d and %d is %d\n", a, b, x);
        System.out.print("Enter Two float number:");
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float y = Float_multiplication(c, d);
        System.out.printf("multiplication of %f and %f is %f\n", c, d, y);
        System.out.print("Enter Two long number:");
        long e = sc.nextLong();
        long f = sc.nextLong();
        long z = Long_multiplication(e, f);
        System.out.printf("multiplication of %d and %d is %d\n", e, f, z);
        sc.close();
    }
}
