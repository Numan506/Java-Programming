
package Encapsolation;

import java.util.Scanner;

public class Person_test {
    public static void main(String[] args) {
        
        Person p1 = new Person ();
        Scanner input = new Scanner(System.in); 
       String name = input.nextLine();
       int age = input.nextInt();
        
        
        p1.setName(name);
        System.out.println("Name is: "+p1.getName());
        
        p1.setAge(age);
        System.out.println("Age is: "+p1.getAge());
       
    }
        
    }
    
    
