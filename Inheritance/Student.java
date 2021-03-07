
package Inheritance;


public class Student extends Person{
    String city;
    //string name;int age,void display1 alraedy comes.
    void display2(){
    
       // System.out.println("name is: "+name); not need use two line because alradey it used to display1,so now we can easily can call and get the result
        //System.out.println("age is: "+age);
        display1();
        System.out.println("City is: "+city);
    
    }
}
