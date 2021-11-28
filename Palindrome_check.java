public class Palindrome_check {
    public static void main(String args[]){
        String str="ashishsihsa";
        // String reveString=
     String s= ispalidrome(str);
    
     if(s.equals(str))
       System.out.println("Palidrome");
    else
    System.out.println("Not palidrome");
    }
    static String ispalidrome(String s){
     String res="";
     char[] arr=s.toCharArray();
    for(int i=0;i<arr.length;i++){
        res=arr[i]+res;
    }
    return res;
    }
}
