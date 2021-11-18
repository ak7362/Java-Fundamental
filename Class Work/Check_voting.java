import java.util.Scanner;
public class Check_voting {
    public static void main(String args[]){

// -->>progran to print whether user is eligible for vote?

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n2=sc.nextInt();
        if(n2>=18)
        System.out.println("You are eligible for Vote!");
        if(n2<18)
        System.out.println("You are eligible for Vote!");
        sc.close();
    }
}
