package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndCopyFile {
    void copyFile() throws IOException{
        int i;
        try(FileInputStream fin = new FileInputStream("C:\\Users\\A B C\\Array1.java"); FileOutputStream fout = new FileOutputStream("C:\\Users\\A B C\\Desktop\\Array1.java")){
            do{
                i=fin.read();
                fout.write(i);
            }while(i != -1);
        }
        catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        ReadAndCopyFile rc = new ReadAndCopyFile();
        rc.copyFile();
    }
}
