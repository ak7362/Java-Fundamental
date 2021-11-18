import java.util.Scanner;
public class Digit_check {
    static void digit_check(int a){
        int count=0;
     while(a>0){
         a/=10;
         count++;
     }
     if(count==1)
     System.out.println("1 digit");
     else if(count==2)
     System.out.println("2 digit");
     else if(count==3)
     System.out.println("3 digit");
     else if(count==4)
     System.out.println("4 digit");
     else if(count==5)
     System.out.println("5 digit");
     else if(count>5)
     System.out.println("More than 5 digit");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        digit_check(n);
        sc.close();
    }
}
