import java.util.Scanner;

public class Control {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

// -->>Program to print the Square of a number if it is less than 10 else print invalid
    
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if (n < 10) {
            n *= n;
            System.out.println("Square of number=" + n);
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
