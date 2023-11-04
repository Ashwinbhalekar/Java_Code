package ioTest.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
     String name;
     int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class TestSerialization {
    public static void main(String[] args) {
        try(FileOutputStream fout = new FileOutputStream("stud.ser"); ObjectOutputStream oos = new ObjectOutputStream(fout)){
            Student student = new Student("Ashwinji",27);
            oos.writeObject(student);
            System.out.println("Object Serialized succefully..");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
