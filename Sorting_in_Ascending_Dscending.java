
package numan;

import java.util.ArrayList;
import java.util.Collections;


public class Sorting_in_Ascending_Dscending {
    public static void main(String[] args) {
       ArrayList<Integer>number = new ArrayList<>();
        
        number.add(11);
        number.add(22);
        number.add(65);
        number.add(78);
        number.add(0);
        System.out.println("The Array number is: "+number);
        Collections.sort(number);//er mane holo cuto theke boro akare shongka dekha be
        System.out.println("Now Show the Ascending number is:"+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Now Show the Ascending number is:"+number);
                
       
    }
    
}
