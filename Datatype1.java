import java.util.Scanner;
public class Datatype1 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter you name:");
    String name=sc.nextLine();
    System.out.println("you name is "+name);
    System.out.print("Enter you age:");
    int age=sc.nextInt();
    System.out.println("you age is "+age);
    System.out.print("Enter you salary:");
    float salary=sc.nextFloat();
    System.out.println("you age is "+salary);
    sc.close();
    }
    
}
