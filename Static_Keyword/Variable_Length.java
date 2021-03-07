
package File.Static_Keyword;

public class Variable_Length {
    
    void value(int ... num){//(...)here any int number accept here.
    
    int sum = 0;
    
        for (int x : num) {
            sum = sum +x;
            //System.out.println("The result is: "+sum);
        }
        System.out.println("The result is :"+sum);
    }
    
    
    
    
    
}
