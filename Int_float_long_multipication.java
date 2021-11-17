import java.util.Scanner;
public class Int_float_long_multipication {
    public int multiplication(int a){
        return a;
    }
    public float multiplication(float a){
        return a;
    }
    public long multiplication(long a){
        return a;
    }
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the integer value: ");
       int i=sc.nextInt();
       System.out.print("Enter the integer value: ");
       float f=sc.nextFloat();
       System.out.print("Enter the integer value: ");
       long l=sc.nextLong();
       Int_float_long_multipication m1=new Int_float_long_multipication();
       int a=m1.multiplication(i);    
       float b=m1.multiplication(f);    
       long c=m1.multiplication(l);
       double d=a*b*c;    
       sc.close();  
       System.out.println("Multiplication of int,float and long is "+d); 
    }
   } 

