import java.util.Scanner;
public class Swap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter First number:") ;
       int a=sc.nextInt();
       System.out.println("Enter First number:") ;
       int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
