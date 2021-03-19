
package numan;

import java.util.Scanner;


public class Number_Convert {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         System.out.print("Given the Integer number here: ");
        int num1=input.nextInt();
       
        String s1=Integer.toBinaryString(num1);
        System.out.println("Binary number is: "+s1);
        
        String s2=Integer.toOctalString(num1);
        System.out.println("Octal Number is :"+s2);
        
        
        String s3=Integer.toHexString(num1);
        System.out.println("Octal Number is :"+s3);
        
        
        
    }
       
    
}
