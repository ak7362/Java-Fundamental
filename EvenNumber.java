public class EvenNumber {
   public static void main(String args[]){
    int n=10;
    //Using for loop
    System.out.println("Using for loop:");
    for(int i=2;i<=n;i=i+2){
        System.out.print(i+" ");  
    }
System.out.println("\n");
    //using while loop
    System.out.println("Using while looop:");
    int i=2;
    while(i<=10){
       System.out.print(i+" ");
       i=i+2;
    }
   }
}
