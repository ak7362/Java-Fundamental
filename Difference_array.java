import java.util.List;

public class Difference_array {
    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 3, 4, 5, 6, 7, 8 };
        boolean contains = false;
        // List<Integer>list=new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[i]) {
                    contains = true;
                    break;
                } else
                    contains = false;
            }
            if (!contains) {
                System.out.println(arr1[i]);
            } else
                contains = false;
        }
    }
}
