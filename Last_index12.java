public class Last_index12 {
    public static void main(String args[]){
        int arr[]={1,5,6,7,8,6,7,4,5};
       for(int i=arr.length-1;i>=0;i--){
           if(arr[i]==5){
              System.out.println("index:"+i);
              break;
           }    
    }
    
}
}

