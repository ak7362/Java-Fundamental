package Assignment;
import java.util.Scanner;
public class Fahrenheit_To_Celsius {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float f=sc.nextFloat();
        Float c=((f-32)*5)/9;
        System.out.println("Temperature in Celsius:"+c+"°C");
sc.close();
    }
    
}
