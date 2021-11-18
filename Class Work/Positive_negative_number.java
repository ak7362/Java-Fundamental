/*Write a method to print whether given number is positive or not */

import java.util.*;
public class Positive_negative_number {
    public static void  isPositive(int a){
        if(a>0)
        System.out.println("Its positive");
        else
        System.out.println("Its negitive");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
       isPositive(a);
       sc.close();
    }
}
