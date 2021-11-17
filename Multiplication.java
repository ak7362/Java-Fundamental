import java.util.Scanner;
public class Multiplication {
    public int multiple(int x,int y){
     return x*y;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Multiplication m1=new Multiplication();
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter first number:");
        int b=sc.nextInt();
        int c=m1.multiple(a,b);
        System.out.printf("Mulipication of %d and %d is %d",a,b,c);
        sc.close();
    }
    
}
