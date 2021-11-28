public class First_index {
   public static void main(String args[]){
       int arr[]={1,5,6,7,8,6,7,4,5};
       for(int i=0;i<arr.length;i++){
           if(arr[i]==1){
               System.out.println("FirstIndex:"+i);
               break;
           }
       }
   } 
}
