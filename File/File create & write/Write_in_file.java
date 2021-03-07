package File;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Write_in_file {

    public static void main(String[] args) {
        
        String name,id,batch,phone;

        try {
            Formatter formatter = new Formatter("C:/Users/jakar/Desktop/numan/numan1.TXT");
            Scanner input = new Scanner(System.in);//user er kas theke nibo.
            System.out.print("How Many Student Registration here: ");
            int num = input.nextInt();
            
            for (int i = 1; i <= num; i++) {
                //System.out.print("Given the student id & name & batch : ");
                System.out.print("Given the student  name: ");
                name = input.next();
                System.out.print("Given the student id: ");
                id = input.next();
                System.out.print("Given the student batch: ");
                batch = input.next();
                System.out.print("Given the student phone : ");
                phone = input.next();
                //name = input.next();
                //id = input.next();
               // batch = input.next();
                //phone = input.next();
                formatter.format("%s   %s \r\n","name",name);
                formatter.format("%s   %s \r\n","id=",id);
                formatter.format("%s   %s \r\n","batch=",batch);
                formatter.format("%s   %s \r\n","phone=",phone);
                System.out.println("Congratulation your registration is complete");
                
            }
            
            formatter.close();
            
           // formatter.format(" %s  %s \r\n", "name = Numan", "506"); // \r\n means return the new line 
            //formatter.format(" %s %s \r\n", "jakaria", "171");      //sora sori korle emon dibo
            //
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }

    }
}
