
package numan;

import java.util.Arrays;


public class Arrsy_Sorting {
    public static void main(String[] args) {
        
        int []number={3,2,5,-1,4};
        
        Arrays.sort(number);
        System.out.println("The Ascending number is: ");
        for (int i = 0; i < number.length; i++) {
            //System.out.printf("number[%d] = ", i);
            System.out.print(" "+number[i]);
                
        }
        System.out.println();
        
        System.out.println("The Dscending number is: ");
        for (int i = 4; i>=0; i--) {
            //System.out.printf("number[%d] = ", i);
            System.out.print(" " +number[i]);
            //System.out.print(" ");
                
    }
      System.out.println( " ");
}
}