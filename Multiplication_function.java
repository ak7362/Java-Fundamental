import java.util.Scanner;
public class Multiplication_function {
    public float multiple1(int x,float y ,long z){
        float d= x*y*z;
        return d;
    }
    public float multiple2(int x,float y ,long z){
        float d= x*y*z;
        return d;
    }
    public float multiple3(int x,float y ,long z){
        float d= x*y*z;
        return d;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Multiplication_function m1=new Multiplication_function();
        //for method 1.
        System.out.print("Enter the Interger value:");
        int a=sc.nextInt();
        System.out.print("Enter the Float value:");
        float b=sc.nextFloat();
        System.out.print("Enter the Long value:");
        long c=sc.nextLong();
        float x=m1.multiple1(a,b,c);
        System.out.printf("Multiplication of %d,%f and %d is %f\n",a,b,c,x); 

        //for method 2.
        System.out.print("Enter the Interger value:");
        int d=sc.nextInt();
        System.out.print("Enter the Float value:");
        float e=sc.nextFloat();
        System.out.print("Enter the Long value:");
        long f=sc.nextLong();
        float y=m1.multiple2(d,e,f);
        System.out.printf("Multiplication of %d,%f and %d is %f\n",d,e,f,y); 

        //for method 3.
        System.out.print("Enter the Interger value:");
        int g=sc.nextInt();
        System.out.print("Enter the Float value:");
        float h=sc.nextFloat();
        System.out.print("Enter the Long value:");
        long i=sc.nextLong();
       float z=m1.multiple1(g,h,i); 
       System.out.printf("Multiplication of %d,%f and %d is %f\n",g,h,i,z);     
        sc.close();
    }
    
}
