import java.util.Scanner;
public class Max_value {
    int max(int a,int b){
        if(a>b)
        return a;
        return b;
    }
    int max(int a,int b,int c){
        if(a>b){
            if(a>c)
                return a;
            else    
                return c;
        }
        if(b>a){
            if(b>c)
             return b;
            else
              return c;
        }
     return 0;
        
    }
    int max(int a,int b,int c,int d){
        int e,f;
        if(a>b)
          e=a;
        else
          e=b;
        if(c>d)
          f=c;
        else
          f=d;
        if(e>f)
           return e;
        else
          return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Max_value m1= new Max_value();
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter third number:");
        int c=sc.nextInt();
        System.out.print("Enter fourth number:");
        int d=sc.nextInt();
    
        int x=m1.max(a,b);
        int y=m1.max(a,b,c);
        int z=m1.max(a,b,c,d);
        System.out.printf("Greater number of %d and %d is %d\n",a,b,x);
        System.out.printf("Greater number of %d,%d and %d is %d\n",a,b,c,y);
        System.out.printf("Greater number of %d,%d,%d and %d is %d\n",a,b,c,d,z);
        

sc.close();
    }
}
