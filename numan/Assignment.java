
package numan;

import java.util.Scanner;


public class Assignment {
    public static void main(String[] args) {
        int length;
        char operator;
        double sum=0;
        double total=1;
        //Scanner input = new Scanner(System.in);
       // System.out.println("How many number do you want");
        System.out.println("operator is : ( + , - ,* , /,  )");
        System.out.print("Choose The operator: ");
        Scanner input = new Scanner(System.in);
        operator=input.next().charAt(0);
        //Scanner input = new Scanner(System.in);
        System.out.print("How many number do you want : ");
        length =input.nextInt();
        //operator=input.next().charAt(0);
        System.out.print("Please enter the given number: ");
        //length =input.nextInt();
        double[]numbers= new double[length];
        if (operator=='+'){
        for (int i = 0; i < length; i++) {
             numbers[i]=input.nextDouble();
        }
        for (int i = 0; i < length; i++) {
            sum = sum+numbers[i];
        }
        System.out.println("the sum is: "+sum);
       
    }
        if (operator=='-'){
            for (int i = 0; i < length; i++) {
                numbers[i]=input.nextDouble();
            }
              
            for (int i = 0; i < length; i++) {
                if (sum>numbers[i]){
                
                    sum-=numbers[i];
                }
                else
                {sum = numbers[i]-sum;
                }
                //sum = numbers[i]-sum;
       
            }
            System.out.println("The subtract is "+sum);
        
        }
            
        if (operator=='*'){
            for (int i = 0; i < length; i++) {
                numbers[i]=input.nextDouble();
            }
              
            for (int i = 0; i < length; i++) {
                total = numbers[i]*total;
       
            }
            System.out.println("The Multiplication is "+total);
        }
        
        
         if (operator=='*'){
            for (int i = 0; i < length; i++) {
                numbers[i]=input.nextDouble();
            }
              
            for (int i = 0; i < length; i++) {
                total = numbers[i]*total;
       
            }
            System.out.println("The Multiplication is "+total);
        }
        if (operator=='/'){
            int a= input.nextInt();
            int b= input.nextInt();
            length = a/b;
            System.out.println("The divided is "+length);
           
            }
           else
            System.out.println("zero does not allow");
        }
        
    }

