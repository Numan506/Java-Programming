
package numan;

import java.util.Scanner;

public class Number_Of_Reverse {
    public static void main(String[] args) {
        int num,sum,r;
        Scanner Input=new Scanner(System.in);
        System.out.print("Given The Number: ");
        num=Input.nextInt();
        sum=0;
        
        while(num!=0){
               
            r = num % 10;
            sum = sum*10+r;
            num = num/10;
       }
        System.out.println("The Reverse is: "+ sum);
    }
    
}
