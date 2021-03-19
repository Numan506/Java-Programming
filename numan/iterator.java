
package numan;

import java.util.ArrayList;
import java.util.Iterator;


public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer>number= new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        //System.out.println("the number is: "+number); caile emon vabe o ber kora jaibo
        Iterator itr =  number.iterator();//Iterator class er variable ekta itr,tarpor iterator method er sahajje number er man gula itr variable er modde chole jabe
        // ei sob programe for eah loop use kora valo
        while(itr.hasNext()){ //itr joto somoy empty hobe na toto somoy cholte thakbe.ortat itr er modde joto somoy value thakbe toto somoycholte thakbe
                System.out.print(" "+itr.next());
               
            }
       
         System.out.println();
         
         // Removing er ketre use korbo
         
         number.remove(1);
         System.out.println("After Removing Result is: "+number);
         number.removeAll(number);
         System.out.println("When all number is remove: "+number);
        
    }
    }
   