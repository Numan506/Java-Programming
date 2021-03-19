
package numan;

import java.util.Scanner;


public class Business {
    
    
    public static void main(String[] args) {
        
        
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many number input here: ");
        int length = input.nextInt();
        int[]numbers = new int[length];
       // System.out.println(numbers.length);
        
        for (int counter = 0; counter < length; counter++) {
           //10 System.out.println("Enter the number "+(counter+1)+ " is");
            System.out.print("Value is: ");
            numbers[counter]=input.nextInt();
        }
      input.close();
        
        //int sum = 0;
        for (int x:numbers) {
            sum = sum+x;
            //System.out.println(x);
        }
          System.out.println("The Total Sum is: "+sum);
          
          System.out.println("The Program is Closed: ");
    }
    
}
