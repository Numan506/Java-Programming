
package Practics;

import java.util.Scanner;


public class Largest_Number {
    public static void main(String[] args) {
        
        int num,largest;
        
        System.out.print("How many number do you want: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        int number[] = new int[num];
        largest = number[0];
        
        for (int i = 0; i < num; i++) {
            number[i] = input.nextInt();
        }
        
        for (int i = 1; i < number.length; i++) {
            if(largest > number[i]){
            
                largest = number[i];
            }
        }
        System.out.println("Largest Number is: "+largest);
        
    }
}
