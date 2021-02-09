
package numan;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        int num,sum,r,temp;
        Scanner Input=new Scanner(System.in);
        System.out.print("Given The Number: ");
        num=Input.nextInt();
        temp=num;
        sum=0;
        
        while(temp!=0){
               
            r = temp % 10;
            sum = temp+r*r*r;//armstron mane holo joto gula number nibo sob gulak alada alada kore quebe kora.
            num = temp/10;
       }
        if(num==sum){
            System.out.println("this number is Armstrong");
        }
        else{
            System.out.println("This number is not Armstrong");
        }
    }   
}
