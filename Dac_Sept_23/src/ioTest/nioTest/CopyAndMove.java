
package ioTest.nioTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyAndMove {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("C:\\Users\\A B C\\Downloads\\OOPS Day 15\\OOPS Day 15\\iotest\\Moved.java");
            Path pathMove = Paths.get("C:\\Users\\A B C\\Downloads\\OOPS Day 15\\OOPS Day 15\\iotest\\niotest\\CopyAndMove.java");
            Files.move(path, pathMove);  //For moving the file
            //Files.copy(path, pathCopy);            //For coping the file
            System.out.println("Copied..");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
