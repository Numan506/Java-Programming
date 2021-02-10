
package numan;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sumOfDiagonalElements = 0;
        int sumOfElements = 0;
        int[] [] A = new int[2][3];
        int[] [] B = new int[2][3];
                
        
        System.out.println("A is input here");
          for (int row = 0; row < 2; row++) {
              for (int col = 0; col < 3; col++) {
                  System.out.printf("A[%d], [%d] = ", row,col);
                  A[row][col]=input.nextInt();
              }
          }
              System.out.println("B is input here");
           for (int row = 0; row < 2; row++){
                for (int col = 0; col < 3; col++) {
                  System.out.printf("B[%d], [%d] = ", row,col);  
                  B[row][col]=input.nextInt();
                  
              }
            
        }

            
        
          for (int row = 0; row < 2; row++) {
              for (int col = 0; col < 3; col++) {
                  System.out.print(" " +A [row][col]);
              }
              System.out.println();
        }
                
              for (int row = 0; row < 2; row++) {
              for (int col = 0; col < 3; col++) {
                  System.out.print(" " +B[row][col]);
              }
              System.out.println();
        }
      
          
          
          
     }
    
}
