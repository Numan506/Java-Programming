
package numan;

import java.util.Scanner;

public class Palindrom_or_not {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String name;
        System.out.print("plz Given here: ");
        name= input.nextLine();//any string input here
        
        
        StringBuffer s1 = new StringBuffer(name);//s1= numan
       // String s2 = s1.reverse().toString();//s2= namun
        //.out.println("name is: "+s2);
        s1.reverse();// if you want it is a possible.
        System.out.println("name is: "+s1);
        //if (s1.equals(name))
       // if (s2.equals(name)){
        
            //System.out.println("This is palindrom");
       // }
      //  else{
         //   System.out.println("This is not palindrom");
        }
    }
//}   