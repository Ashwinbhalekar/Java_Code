/*Q6.Write a java program to create a demo application to understand the role of access modifiers.*/
package Assignment;

import java.util.Scanner;

class Modifiers{
    private String name;
    protected int Id;
    int age;
    public String collegeName;
    Scanner sc = new Scanner(System.in);
    
    private void privateMethod(){
        System.out.println("Name of student: "+name);
        name = sc.nextLine();
    }
    protected void protectedMethod(){
        System.out.println("Id of Student: "+Id);
        Id = sc.nextInt();
    }
    void defaultMethod(){
        System.out.println("Age of Student: "+age);
        age = sc.nextInt();
    }
    public void publicMethod(){
        System.out.println("Name of college: "+collegeName);
        collegeName = sc.nextLine();
    }
}
public class Assign6 {
    public static void main(String[] args) {
        Modifiers m = new Modifiers();
       // m.privateMethod();
        m.protectedMethod();
        m.defaultMethod();
        m.publicMethod();
    }
    
}


