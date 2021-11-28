import java.util.Scanner;

public class Midel_element_array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print("Enter element of array:");
            arr[i] = s.nextInt();
            
        }
        int n = (arr.length / 2)-1;
        System.out.println("Middel Element of array:"+arr[n]);

    }

}
