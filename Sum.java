import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
//for loop
System.out.println("using for Loop:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1=sc.nextInt();
        int i,sum=0;
        for(i=0;i<=n1;i++){
            sum=sum+i;
        }
        System.out.println("sum of number: "+sum);
        System.out.println("\n");
//using while Loop
System.out.println("Using while loop: ");
System.out.print("Enter the number: ");
int n2=sc.nextInt();
int j=0,sum1=0;
        while(j<=n2){
           sum1=sum1+j;
           j++;
}
System.out.println("Sum of number: "+sum1);

       
    }

}
