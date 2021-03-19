
package numan;

import java.util.Scanner;


public class Math_Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("pleaser enter the given number: ");
        double number = input.nextDouble();
        
       //double result =  Math.abs(number);  tahole ei line ta r likh laglo na
        System.out.println("The Result is: "+Math.abs(number));
        System.out.println("The Result is: "+Math.sqrt(number));
        System.out.println("The Result is: "+Math.pow(2,5));
        System.out.println("The Result is: "+Math.max(-0.22,-0.5));
        System.out.println("The Result is: "+Math.min(-0.22,-0.5));
        System.out.println("The Result is: "+Math.PI);
        System.out.println("The Result is: "+Math.ceil(number));
        System.out.println("The Result is: "+Math.floor(number));
        
        
    }
}
