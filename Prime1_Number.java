import java.util.Scanner;
public class Prime1_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,count=0;

        for(i=2;i<n;i++){
              if(n%i==0){
                  count=count+1;
               break;
              }
        }
        if(count==0)
           System.out.println(n+" is Prime number");
        else
          System.out.println(n+" is not prime number");
    }
}
