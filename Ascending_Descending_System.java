
package Exam;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_Descending_System {
    
    
    public static void main(String[] args) {
        
           int [] number = {1,4,5,3,8,9,2,6,7,10};
   
   
   Arrays.sort(number);
   
   
        for (int i = 0; i < number.length; i++) {
            
            System.out.println(" "+number[i]);
            
        }
        
        System.out.println("\n");
        for (int j = number.length-1; j > 0; j--) {
            System.out.println(" "+number[j]);
        }
        
        System.out.println("\n");
        
        
   String [] name = {"nu","no","ef","d","c"};
   
   
   Arrays.sort(name);
   
   
        for (int i = 0; i < name.length; i++) {
            
            System.out.println(" "+name[i]);
            
        }
        
        System.out.println("\n");
        for (int j = name.length-1; j >= 0; j--) {
            System.out.println(" "+name[j]);
        }
        
    }
    
}
