
package numan;
import java.util.Scanner;

public class Ans_3 {
    public static void main(String[] args) {
        char number;
        Scanner Input = new Scanner(System.in);
        System.out.println("Select is : ( 1 , 2 ,3 , 4, 5 )");
        System.out.print("Select Number is : ");
        number=Input.next().charAt(0);
        
        
         switch(number) {
        
                 case'1':
                     System.out.printf("Course code: is 301");
                     System.out.printf("Course title: Discreate Math ");
                     break;
                     
                 case'2':
                      System.out.printf("Course code: Mat 103");
                      System.out.printf("Course title: Analysis & vector; ");
                     break;
                 case'3':
                     System.out.printf("Course code: CSE 115 ");
                     System.out.printf("Course title: OOP ");
                     break;
                
                 case'4':
                      System.out.printf("Course code: CSE 116");
                     System.out.printf("Course title: OOP Lab");
                     break;
                     
                 case'5':
                     System.out.printf("Course code: EEE 201");
                     System.out.printf("Course title: Electrical Engineering ");
                     break;
                
                 default:
                     System.out.println("invalid operator");
                     
         
        
        
        }
        
    }
    
}
    

