package ioTest.nioTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCreation {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("C:\\Users\\A B C\\Downloads\\OOPS Day 15\\OOPS Day 15\\iotest\\niotest\\Ashu\\Ashwin.txt");
            //Path p1 = Files.createDirectories(p);    //For creating directory(Folder)
            Path p1 = Files.createFile(p);
            System.out.println("File Created...");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }  
}
