
package File.Static_Keyword;

import java.util.Scanner;


public class Factorial_test {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Please given the factorial number: ");
        int number = input.nextInt();
        
        Factorial num = new Factorial();
        
      int result= num.fac(number);
        System.out.println("factori is: "+result);
    }
}
