public class Person {
   
       // fields
       private String name;
       private String email;
       private String phoneNumber;
    
       // constructor
       public Person(){
            this("Alok","alok45@gmail.com");
       }
       public Person(String theName)
       {
      
          this.name = theName;
       }
       //constructor
       Person(String theName,String theEmail){
         this.name = theName;
          this.email=theEmail;
          
       }
      Person(String theName,String theEmail,String thephoneNumber){
         this.name = theName;
         this.email=theEmail;
         this.phoneNumber=thephoneNumber;
       }
    
       // methods - getters
       public String getName() { return this.name;}
       public String getEmail() { return this.email;}
       public String getPhoneNumber() { return this.phoneNumber;}
    
       // methods - setters
       public void setName(String theName) { this.name = theName;}
       public void setEmail(String theEmail) {this.email = theEmail;}
       public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
       public String toString()
       {
          return this.name + " " + this.email + " " + this.phoneNumber;
       }
    
       // main method for testing
       public static void main(String[] args)
       {
          Person p1 = new Person("Sana");
          p1.setEmail("sana8967@gmail.com");
          p1.setPhoneNumber("7867567897");
          System.out.println(p1);
          Person p2 = new Person("Jean");
          p2.setEmail("jean@gmail.com");
          p2.setPhoneNumber("404 899-9955");
          System.out.println(p2);
          Person p3 = new Person("Ashish","akyadav7362@gmail.com");
          p3.setPhoneNumber("7687659876");
          System.out.println(p3);
          Person p4=new Person();
          p4.setPhoneNumber("8967567567");
          System.out.println(p4);
          Person p5 = new Person("Juli","juli562@gmail.com","90786767878");
          System.out.println(p5);

       }
    }
     

