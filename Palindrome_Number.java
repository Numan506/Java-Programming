
package numan;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        int num,sum,r,temp;
        Scanner Input=new Scanner(System.in);
        System.out.println("Given The Input number: ");
        num = Input.nextInt();
        temp=num;
        sum = 0;
        while(temp!=0){
             r=temp%10;
             sum =sum*10+r;//palindrom ber korte hole age reverse korte hobe
             temp=temp/10;
          }
        if(num==sum){
        
            System.out.println("The number is palndrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        
    }
}
