package File;

import java.io.File;

public class File_Demo1 {

    public static void main(String[] args) {

        //File dir = new File("jakaria");  eita OOP file a create hobe,
        File dir = new File("C:/Users/jakar/Desktop/Tanvir.");// j kunu ekta file er link ene tar modde create file er nam diye dilei hobe
        dir.mkdir();//directory will be created

        String dirlocation = dir.getAbsolutePath();//mane amar file ta kun jaigay create hoise tha dekhabe
        System.out.println(dirlocation);// ortat amar file ta kun jaigay ase tha dekhte parbo
        System.out.println(dir.getName());//ortat ki name save korci tha ber kora jabe

        if (dir.delete()) {//ortat jodi ami folder delete koe dite cai tahole eita use korbo

            System.out.println(dir.getName() + "folder has been deleted. ");
        }

    }
}
