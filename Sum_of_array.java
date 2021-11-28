import java.util.Scanner;

public class Sum_of_array {
    static void sumOfArray() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter array element:");
            int n = sc.nextInt();
            arr[i] = n;
            sum += arr[i];
        }
        System.out.println("sum of array:" + sum);
        sc.close();
    }

    public static void main(String args[]) {
        sumOfArray();
    }
}
