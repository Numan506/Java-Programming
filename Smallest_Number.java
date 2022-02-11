
package Practics;

import java.util.Scanner;


public class Smallest_Number {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("How manr number do you want input here: ");
        int num = input.nextInt();
        
        int number[] = new int[num];
        
        
        for (int i = 0; i < num; i++) {
            number[i] = input.nextInt();
        }
        
        int smallest = number[0];
        
        for (int i = 0; i < number.length; i++) {
            if(number[i]<smallest){
            
                smallest = number[i];
            }
        }
        
        System.out.println("Smallest number is: "+smallest);
    }
    
}
