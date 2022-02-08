
package Exam;

import java.util.Scanner;


public class Total_Charecter_Count {
    public static void main(String[] args) {
        int count=0;
//        String name="Abu jakaria Md Numan my uytur eet";
        Scanner input = new Scanner(System.in);
        System.out.print("Please inter the Name: ");
        String name = input.nextLine();
        for (int i = 0; i <name.length(); i++){
            if(name.charAt(i)!=' '){
                count ++;
            }
            
        }
        System.out.println("Total Length is: "+count);
    }
            
}
