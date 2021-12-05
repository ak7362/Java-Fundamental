abstract class Book {
    Book(){

    }
    String title;
    abstract void setTitle(String s);
     
    String getTitle(){
        return title;
    }
    
}
 class Book1 extends Book{
    String title;
    void setTitle(String s){
        this.title=s;
    }
    String getTitle(){
        return title;
    }
}
 class MyBook{
    public static void main(String args[]){
        Book1 new_novel=new Book1(); 
        new_novel.setTitle("A tale of two cities");
        System.out.println("The title is: "+new_novel.getTitle());
        }
}





