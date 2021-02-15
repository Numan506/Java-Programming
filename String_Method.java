
package numan;

import java.util.Scanner;


public class String_Method {
    public static void main(String[] args) {
        String text,repla;
        Scanner input = new Scanner (System.in);
        System.out.print("Plz Given the text: ");
        text = input.nextLine();
        System.out.println(text);
        
        repla= text.replace('b','B');
        System.out.println("after the replaement in text: "+repla);
        
       String[] s2=text.split(" ");// when it find any space after that it create a new line.
        for (String x : s2) {
            System.out.println(x);
            
        }
        
    }
}
