package Assignment;

import java.util.*;

public class Print_int_char_double {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer:");
        int a = sc.nextInt();
        System.out.print("Enter the Character:");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the Double:");
        Double d = sc.nextDouble();

        System.out.println("Integer:" + a);
        System.out.println("Character:" + ch);
        System.out.println("Double:" + d);
        sc.close();
    }

}
