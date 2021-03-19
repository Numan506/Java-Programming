
package numan;

import java.util.ArrayList;


public class Array_List {
    public static void main(String[] args) {
        
        ArrayList<Integer>number =new ArrayList<>(); //<>angular breaket
        //System.out.println("The size of: "+number.size());
        number.add(15);// 0 number index a add hobe
        number.add(20);// 1 number index a add hobe
        number.add(25);// 2 number index a add hobe
        number.add(3,30);// 3 number index a add hobe
        System.out.println("The Size of :"+number.size());
        for(int x:number)//caile for each loop er maddome o size ber kora jabe
        {
            System.out.print(" "+x);
        }    
        //System.out.println(number);
        System.out.println(" ");
    }
    
}
