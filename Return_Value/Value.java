
package Return_Value;

import java.util.Scanner;

public class Value {
    public static void main(String[] args) {
        Return number= new Return();
        Scanner input = new Scanner(System.in);
        System.out.print("Plz given the input 1st number: ");
        int value=input.nextInt();
        int result= number.square(value);
       //int result= number.square(5); if you want this is possible
        System.out.println("The result is : "+result);
        
        
        
        Return number1= new Return();
       //Scanner input = new Scanner(System.in);
        System.out.print("Plz given the input 2nd number: ");
        int num=input.nextInt();
        value = num;
        int num1 = number1.square(value);
       //int result= number.square(5); if you want this is possible
        System.out.println("The result is : "+num1 );
    }
            
}
