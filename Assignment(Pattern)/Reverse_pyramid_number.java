public class Reverse_pyramid_number {
    public static void main(String args[]){
        int i,j,k=1;
        for(i=0;i<5;i++){
            for(j=i;j<5;j++){
                System.out.print(k+" ");
            }
            k=k+1;
            System.out.println();
        }
    }
}
