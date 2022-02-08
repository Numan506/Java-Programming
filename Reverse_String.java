
package Exam;

import java.util.Scanner;


public class Reverse_String {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the name: ");
        String name=input.nextLine();
        String result ="";
        
        for (int i = name.length()-1; i >=0; i--) {
            result = result+name.charAt(i);
        }
        System.out.println("Result is: "+result);
    }
}
