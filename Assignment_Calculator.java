
package numan;

import java.util.Scanner;


public class Assignment_Calculator {
   public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int length;
        double sum = 0;
        length=input.nextInt();
        double[]number = new Int[length];
        System.out.print("plz enter the 6 number: ");
        
        for (int i =0; i < length; i++) { //ei kahne 6 na diye number.length dile o hobe
            number[i]=input.nextDouble();
            //System.out.println(number[i]);
        }
       // number[0]=1;
        //number[1]=1;
        //number[2]=1;
        //number[3]=1;
        //number[4]=1;
        //number[5]=1;
        for (int i = 0; i < 2; i++) {
            sum = sum+number[i];
        }
        System.out.println("the sum is: "+sum);
        double average = (sum/6);
        System.out.println("the averge number is: "+average);
        
    }
    
}
