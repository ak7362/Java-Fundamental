public class Reverse_string {
    public static void main(String args[]){
        String str="Geekster";
        reverse(str);
    }
    static void reverse(String s){
        String res="";
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            res=arr[i]+res;
        }
        System.out.println(res);
    }
}
