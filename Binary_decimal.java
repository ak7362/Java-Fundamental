import java.util.Scanner;
public class Binary_decimal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int base=1,dec_value=0;
     while(temp!=0){
            int last_digit=temp%10;
            temp=temp/10;
            dec_value+=last_digit*base;
            base=base*2;
        }
        System.out.print(dec_value);
        sc.close();
    }
}
