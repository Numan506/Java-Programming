
package oop;

public class result {
    public static void main(String[] args) {
        Student numan= new Student();
        
        numan.name = "Abu jakaria md Numan";
        numan.university = "City university";
        numan.city = "Dhaka";
        numan.phone = 1718508826;
        numan.id = 171442506;
        
        System.out.println("My name is: "+numan.name);
        System.out.println("My university name is: "+numan.university);
        System.out.println("I live in: "+numan.city);
        System.out.println("My phone number is: "+numan.phone);
        System.out.println("My id number is: "+numan.id);
    }
    
}
