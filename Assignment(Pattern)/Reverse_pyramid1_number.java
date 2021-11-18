public class Reverse_pyramid1_number {
    public static void main(String args[]){
        int i,j,k=1,count=1;
        for(i=0;i<5;i++){
             k=count;
            for(j=i;j<5;j++){
                System.out.print(k+" ");
                k=k+1;
            }
             count=count+1;
            System.out.println();
        }
    }
    
}
