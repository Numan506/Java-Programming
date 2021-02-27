
package numan;

public class StaticBlock {
    static int number;
    static String name;

static {
        number = 14;
        name = "Abu jakaria Md Numna" ;
}

static void display(){

    System.out.println("Number is: "+number);
    System.out.println("Name is: "+name);
}


    public static void main(String[] args) {
        StaticBlock.display();
    }
}