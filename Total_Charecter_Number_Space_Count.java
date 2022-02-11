
package Practics;

import java.util.Scanner;


public class Total_Charecter_Number_Space_Count {
    
    
    public static void main(String[] args) {
        
        String txt;
        
        int text=0;
        int number=0;
        int space=0;
        
        System.out.println("Please given the text: ");
        
        Scanner input = new Scanner(System.in);
        
        txt = input.nextLine();
        txt = txt.toLowerCase();
        
        for (int i = 0; i < txt.length(); i++) {
            if(txt.charAt(i) >='a' && txt.charAt(i) <= 'z'){
              text++;
            }
            else if(txt.charAt(i) == ' '){
              space++;
            }else{
              number++;
            }
        }
        System.out.println("Total Text is: "+text);
        System.out.println("Total Space is: "+space);
        System.out.println("Total Number is: "+number);
        
    }
    
}
