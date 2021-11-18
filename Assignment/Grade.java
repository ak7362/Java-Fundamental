import java.util.Scanner;
public class Grade {
    public static void grade(int m){
        if(m>=90 && m<=100)
        System.out.println("A+ grade");
        else if(m>=80 && m<90)
        System.out.println("A grade");
        else if(m>=70 && m<80)
        System.out.println("B grade");
        else if(m>=60 && m<70)
        System.out.println("C grade");
        else if(m>=50 && m<90)
        System.out.println("D grade");
        else 
        System.out.println("fail");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int marks=sc.nextInt();
        grade(marks);
        sc.close();
    }
}
