package Assignment;
import java.util.Scanner;
public class Ascii_value {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any Character:");
char ch=sc.next().charAt(0);
int a=ch;
System.out.println("ASCII VALUE:"+a);

sc.close();
    }  
}
