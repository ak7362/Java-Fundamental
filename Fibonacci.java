import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){

//For Loop 
System.out.println("Using For loop:  ");       
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a Number:");
   int n=sc.nextInt();
   int n1=0,n2=1,n3,i;
   System.out.print(n1+" "+n2);
   for(i=2;i<=n;i++){
       n3=n1+n2;
       System.out.print(" "+n3);
       n1=n2;
       n2=n3;
   }
System.out.println("\n");
//While Loop  
System.out.println("Using while Loop:  ");
System.out.print("Enter the number: ");
int t=sc.nextInt();
int t1=0,t2=1,t3,j=2;
System.out.print(t1+" "+t2);
while(j<=t){
   t3=t1+t2;
   System.out.print(" "+t3);
   t1=t2;
   t2=t3;
   j++;
}
    }
}
