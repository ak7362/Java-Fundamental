import java.util.Scanner;
public class Find_String {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        boolean isContains=s.contains("word");
        if(isContains)
        System.out.println("word is Present in String");
        else
        System.out.println("word is not Present in String");
        sc.close();
    }
}
