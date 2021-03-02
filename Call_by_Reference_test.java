
package oop;


public class Call_by_Reference_test {
    public static void main(String[] args) {
        
        Call_by_Reference r1 = new Call_by_Reference();
        Call_by_Reference r2 = new Call_by_Reference();
        
        r1.name = "Jakaria";
        r2.name = "manush";
        
        
        System.out.println("before the call: "+r1.name);
        
        r1.change(r1);//
        System.out.println("afte the call: "+r1.name);//ja cng er jonno patabo shetai chck korbo
        r2.change(r2);
        System.out.println("afte the call: "+r2.name);
    
        
    }
    
}
