
package numan;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        char operator;
      
        double num1,num2;
        Scanner Input = new Scanner(System.in);
        System.out.println("operator is : ( + , - ,* , /,  )");
        System.out.print("Choose The operator: ");
        operator=Input.next().charAt(0);
        System.out.println("Enter the two number one by one ");
        num1 =Input.nextDouble();
        num2 =Input.nextDouble();
        Input.close();
        
        switch(operator) {
        
                 case'+':
                     System.out.printf("%2f + %2f = %f", num1,num2,(num1+num2));
                     break;
                     
                 case'-':
                     System.out.printf("%f - %f = %f", num1,num2,(num1-num2));
                     break;
                 case'*':
                     System.out.printf("%f * %f = %f", num1,num2,(num1*num2));
                     break;
                
                 case'%':
                     
                     System.out.printf("%f % %f = %f", num1,num2,(num1%num2));
                     break;
                     
                 case'/':
                     if(num2!=0)
                     System.out.printf("%f / %f = %f", num1,num2,(num1/num2));
                     
                     else
                         System.out.printf("Divided by zero situation");
                     break;
                
                 default:
                     System.out.println("invalid operator");
                     
         
        
        
        }
        
    }
    
}
