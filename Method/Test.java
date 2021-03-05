
package Method;


public class Test {
    public static void main(String[] args) {
        System.out.println("Teacher1 Address here is: ");
        
        Teacher teacher1 = new Teacher();
        teacher1.setInformation("Abu jakaria Md numan","Dhaka","Male",718508826);
        teacher1.displayInformation();
        System.out.println( );
        
        System.out.println("Teaher2 Address here: ");
        
        Teacher teacher2 = new Teacher();
        teacher2.setInformation("Rafsan","Dhaka","Male",138338923);
        teacher2.displayInformation();
        
        
        
    }
    
}
