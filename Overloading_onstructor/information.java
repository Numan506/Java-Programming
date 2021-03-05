
package Overloading_onstructor;


public class information {
    public static void main(String[] args) {
        
    
   Teacher teacher1 = new Teacher();
    
    Teacher teacher2 = new Teacher("Numan","Male");
    teacher2.displayInformation();
    
    
    
    
    Teacher teacher3 = new Teacher("Numan","Male",1718508826);
    teacher3.displayInformation(); 
   
   
}
}