
package oop;


public class Call_by_Value_Test {
    public static void main(String[] args) {
        Call_by_Value obj = new Call_by_Value();
        
        int x =10;
        System.out.println("X before Call:"+x);
        
        obj.change(x);// x is actual perameter
        
        System.out.println("X after Call "+x);
    }
    
}
