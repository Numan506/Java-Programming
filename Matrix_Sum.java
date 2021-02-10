
package numan;

import java.util.Scanner;


public class Matrix_Sum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sumOfDiagonalElements = 0;
        int sumOfElements = 0;
        int sumOfLowerElements = 0;
        int[] [] A = new int[2][3];
      
                
        
        System.out.println("A is input here");
          for (int row = 0; row < 2; row++) {
              for (int col = 0; col < 3; col++) {
                  System.out.printf("A[%d], [%d] = ", row,col);
                  A[row][col]=input.nextInt();
              }
          }
            
        
          for (int row = 0; row < 2; row++) {
              for (int col = 0; col < 3; col++) {
                  if(row==col){
                     sumOfDiagonalElements= sumOfDiagonalElements+A[row][col];
                  }
                  if(row<col){
                      sumOfElements= sumOfElements+A[row][col];
                  
                  }
                  if(row<col){
                  sumOfLowerElements= sumOfLowerElements+A[row][col];
                  
                  }
              }
              
        }
                System.out.println("sumOfDiagonalElements: "+sumOfDiagonalElements);
                System.out.println("sumOfElements: "+sumOfElements);
                System.out.println("sumOfLowerElements: "+sumOfLowerElements);
           
          
    }
}
