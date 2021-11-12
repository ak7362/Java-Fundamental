import java.util.Scanner;
public class Table {
    public static void main(String args[]){
int i;
System.out.println("Enter a number:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
 for(i=1;i<11;i++){
 System.out.format("%d*%d=%d\n",n,i,n*i);
}
    }
    
}
