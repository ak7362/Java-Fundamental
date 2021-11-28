import java.util.Scanner;
public class Positive_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
         int i;
         for(i=0;i<10;i++){
             System.out.print("Enter the array element:");
             arr[i]=sc.nextInt();
           
         }
         i=0;
         while(i<10){
             if(arr[i]>0){
                 System.out.print(arr[i]+" ");
             }
             i++;
            }
           
         }
        
    }

