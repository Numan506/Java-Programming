
package numan;

import java.util.Scanner;


public class Sum_Of_Digits {
    public static void main(String[] args) {
        
    int num,r,sum;
    Scanner Input = new Scanner (System.in);
    System.out.print("plz enter the given number: ");
    
    num =Input.nextInt();
    sum = 0;
    while(num!=0){
    
           r = num % 10;
    
           sum = sum+r;
           //System.out.println("result"+sum);
           num=num/10;
    }
        System.out.println("the sum is: " +sum);
}
}