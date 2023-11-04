/*2. Write a program in java to create a class name studinfo accept the student
information by the member method getdata and inherit it in the base class name marks create
method to get marks in derived class and calculate the percentage and display the complete
information of student do this for three students.
*/
package Assignment;

import java.util.Scanner;

class studInfo{
    public String name;
    public int StudentId;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student:");
        name = sc.nextLine();
        System.out.println("Enter Id of the student: ");
        StudentId = sc.nextInt();
    }
}
class Marks extends studInfo{
    public int m1,m2,m3;
    public float per;
    void getMark(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Mark of subject 1:");
        m1 = sc.nextInt();
        System.out.println("Enter The Mark of Subject 2: ");
        m2 = sc.nextInt();
         System.out.println("Enter The Mark of Subject 3: ");
        m3 = sc.nextInt();
    }
    void calPercentage(){
        per=(m1+m2+m3)/3;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Student Id: "+StudentId);
        System.out.println("Enter The Mark of subject 1: "+m1);
        System.out.println("Enter The Mark of subject 2: "+m2);
        System.out.println("Enter The Mark of subject 3: "+m3);
        System.out.println("Percentage: "+per);
    }
}
public class Assign2 {
    public static void main(String[] args) {
        Marks Student1 = new Marks();
        Student1.getData();
        Student1.getMark();
        Student1.calPercentage();
        Student1.displayInfo();
        
        Marks Student2 = new Marks();
        Student2.getData();
        Student2.getMark();
        Student2.calPercentage();
        Student2.displayInfo();
        
        Marks Student3 = new Marks();
        Student3.getData();
        Student3.getMark();
        Student3.calPercentage();
        Student3.displayInfo();
        
    }
}
