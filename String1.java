public class String1 {
   public static void main(String args[]){
       String s="word";
       String firstLetter=s.substring(0,1);
       String remainingLetter=s.substring(1,s.length());
       firstLetter=firstLetter.toUpperCase();
      String name=firstLetter+remainingLetter;
      System.out.println("Name: "+name);
   } 
}
