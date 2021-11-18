import java.util.Scanner;
public class Minimum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
            System.out.println("Minimum:" + b);
        else
            System.out.println("Minimum:" + a);

        sc.close();
    }
    
}
