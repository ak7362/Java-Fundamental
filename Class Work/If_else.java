
/* print "num is between 0 and 10" when num is between 0 and 10 */

import java.util.Scanner;
public class If_else {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number:");
      int n=sc.nextInt();
      if(n>=0){
          if(n<=10){
              System.out.println("num is between 0 and 10");
          }
          else
           System.out.println("numuber is greater than 10");
      }
      else
      System.out.println("numuber is less than 0");
       
      sc.close();
    }
}
