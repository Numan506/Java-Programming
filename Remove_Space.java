
package Exam;

import java.util.Scanner;


public class Remove_Space {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plese enter the Name: ");
        String name = input.nextLine();
        
        name = name.replaceAll("\\s+","");
        System.out.println("Name is: "+name);
    }
    
}
