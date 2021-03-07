
package File;

import java.io.File;

public class File_Create {
    public static void main(String[] args) {
        
        File dir = new File("numan");
        dir.mkdir();
        
        File file1 = new File("C:/Users/jakar/Desktop/numan/numan.txt");
        File file2 = new File("C:/Users/jakar/Desktop/numan/numan1.txt");
        //File file1 = new File("F:/Numan java/OOP/mid/numan.txt");
        //File file2 = new File("F:/Numan java/OOP/mid/numan1.txt");
        System.out.println("files aere created");//jodi sotik moto kaj kore tahole ei likha dekhabe
       
        try{
        file1.createNewFile();
        file2.createNewFile();
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
