
package numan;

import java.util.ArrayList;
import java.util.Iterator;


public class NewClass {
    public static void main(String[] args) {
        
        
        ArrayList<Integer>number= new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        Iterator itr =  number.iterator();
        
        while(itr.hasNext()){
                System.out.println(" "+itr.next());
            }
       
        
        
    }
    
    
}
