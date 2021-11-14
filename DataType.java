public class DataType {
    public static void main(String args[]){
        float f=100.11111111f;
        System.out.println(f);
        double d=100.11111111111;
        System.out.println(d);
        int a=5;
    int arr[]={1,2,3,4};
        addvalue(a);
        addValuearry(arr[3]);
        System.out.println(a);
        System.out.println(arr[3]);
    }
    public static void addvalue(int a){
         a=a+10;
    }
    public static void addValuearry(int num){
     num=num+10;
    }
    
}
