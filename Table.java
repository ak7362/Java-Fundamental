import java.util.Scanner;
public class Table {
    public static void main(String args[]){

//for loop
System.out.println("Using for loop: ");
int i;
System.out.print("Enter a number:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
 for(i=1;i<11;i++){
 System.out.format("%d*%d=%d\n",n,i,n*i);
}
System.out.println();


//While Loop
System.out.println("Using While loop:");
System.out.print("Enter the number: ");
int n1=s.nextInt();
int j=1;
while(j<=10){
    System.out.printf("%d*%d=%d\n",n1,j,n1*j);
    j++;
}
    }
    
}
