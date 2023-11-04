package ioTest;

import java.io.FileInputStream;

public class ReadFile {
    void readFile(){
        FileInputStream fin = null ;
        int i;
        try{
        fin = new FileInputStream("C:\\Users\\A B C\\Array1.java");
        
        do{
         i =fin.read();
            System.out.print((char)i);
        }
        while(i != -1);    //End Of File
        
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                fin.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        rf.readFile();
    }
}
