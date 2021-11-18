import java.util.Scanner;
public class OddEvenMethodcall {
    public boolean CheckoddEven(int a){
        if(a%2==0)
          return true;
        else
          return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        OddEvenMethodcall m1=new OddEvenMethodcall();
       boolean a= m1.CheckoddEven(n);
       if(a==true)
         System.out.println("Even number");
       else
         System.out.println("Odd number");
        sc.close();
    }
}

