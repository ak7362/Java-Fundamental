import java.util.Scanner;

public class Array_sum {
    static int array_sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five number:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int arr[] = { a, b, c, d, e };
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        sc.close();
    
        return sum;
    }

    public static void main(String args[]) {
       System.out.println("Sum of array="+array_sum());
    }
}
