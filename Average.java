import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int c=(a+b)/2;
  System.out.println("Average:"+c);
        sc.close();
    }
}
