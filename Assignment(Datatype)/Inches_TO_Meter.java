package Assignment;
import java.util.Scanner;
public class Inches_TO_Meter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of inches: ");
        int inches=sc.nextInt();
        double meter;
        meter=inches/39.37;
        meter=inches*0.0254;
        System.out.printf("Value in meter is:%.3f",meter);
sc.close();
    }
    
}
