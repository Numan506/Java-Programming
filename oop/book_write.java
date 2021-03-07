
package oop;
class Favorite_book{
     String name;
      
      public void myMethod(){
       
          System.out.println("book name is"+name);
         
      }
}

public class book_write {
    public static void main(String[] args) {
        Favorite_book obj = new  Favorite_book();
       // obj.myMethod("CSE");
           obj.name="CSE";
           obj.myMethod();
    }
}
