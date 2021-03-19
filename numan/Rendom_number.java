
package numan;

import java.util.Random;
import java.util.Scanner;

public class Rendom_number {
    public static void main(String[] args) {
        //Scanner input =new Scanner(System.in);
       // System.out.println("Plz given the number: ");
        //int num=input.nextInt();
        Random rand=new Random();
        
        int Number=rand.nextInt(12)+5;
        System.out.println("Random Number is : "+Number);
    }
    
}
