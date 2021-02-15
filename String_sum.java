
package numan;


public class String_sum {
    public static void main(String[] args) {
        String first_name,last_name,full_name;
        first_name=new String("Abu Jakaria Md.");
        last_name=new String("Numan");
        
        full_name= first_name+last_name;// easily we can sum one or more string 
        System.out.println("My Name is : "+full_name);
        //Now we can do the some method work
        String Upper=first_name.toUpperCase();
        System.out.println("The Upper Case is: "+Upper);// this formula through you can do any string capital letter
        String Lower=first_name.toLowerCase();
        System.out.println("The Upper Case is: "+Lower);// this formula through you can do any string lower letter
        boolean b = first_name.startsWith("N");//This lines means my first name starat with "N" or not
        System.out.println("b= "+b);// if my first name start with N,it show print (True) otherwise it show (False)
        boolean last = first_name.endsWith("k");
        System.out.println("last= "+last);
        
        
    }
}
