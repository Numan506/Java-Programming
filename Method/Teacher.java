
package Method;

public class Teacher {
   String name,city,gender;
   int phone;
    void setInformation(String n,String c,String g,int p){
        
     name=n;
     city=c;
     gender=g;
     phone=p;
     
    
    
    }
    
    void displayInformation(){
            System.out.println("Name is: "+name);
            System.out.println("City Name is: "+city);
            System.out.println("Gender is: "+gender);
            System.out.println("Phone Number is: "+phone);

}
}
