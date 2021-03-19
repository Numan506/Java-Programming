
package numan;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        int num,row,col;
        num=Input.nextInt();
        for ( row = 1; row <= num; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        
        System.out.println("the program is end");
    }
    
}
