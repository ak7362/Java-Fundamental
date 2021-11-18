// package Assignment;
import java.util.Scanner;
public class Ascii {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the first Character:");
     char a=sc.next().charAt(0);
     System.out.println("Enter the Second Character:");
     char b=sc.next().charAt(0);
     System.out.println("Enter the Third Character:");
     char c=sc.next().charAt(0);
     int d=a+b+c;
     System.out.printf("Sum of ASCII Value is %d where equivalent character is %c",d,d);
        sc.close();
    }  
}
