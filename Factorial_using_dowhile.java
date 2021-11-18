import java.util.Scanner;
public class Factorial_using_dowhile {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        
         
         String s="";
         do{ 
            int fact=1,i=1;
            System.out.print("Enter the number:");
            int n=sc.nextInt();
            for(i=1;i<=n;i++){
                fact=fact*i;
             }
             System.out.printf("Factorial of %d! is %d\n",n,fact);
             System.out.print("If you wants to countinue yes other wise no:");
              s=sc.next();
              
         }while(s.equals("yes"));
    
         
    sc.close();     
    }
}
