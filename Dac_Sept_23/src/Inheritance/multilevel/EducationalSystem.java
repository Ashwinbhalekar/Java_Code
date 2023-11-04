/*Q1. Create a Java program to model a basic educational system using classes, constructors, and
inheritance. Define three classes: Person, Student, and Teacher. The Student and Teacher classes should
inherit from the Person class. Implement constructors in each class to initialize their attributes.
The Person class should have the following attributes and methods:
name (String)
age (int)
gender (String)
displayDetails(): Display the name, age, and gender of the person.
The Student class should be a subclass of Person and have an additional attribute and method:
studentID (int)
study(): Display a message indicating that the student is studying.
The Teacher class should also be a subclass of Person and have an additional attribute and method:
teacherID (int)
teach(): Display a message indicating that the teacher is teaching.
--Write a Java program that creates instances of Student and Teacher, initializes their attributes, and
demonstrates their methods.*/
package Inheritance.multilevel;
class person{
    String name;
    int age;
    String gender;
    public person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void displayDetails(){
        System.out.println("Name of the person: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class student extends person{
    int studentId;
    public student(String name, int age, String gender, int studentId){
        super(name, age, gender);
        this.studentId = studentId;
    }
    void study(){
        System.out.println(name+" is studing.");
    }
}    
class teacher extends person{
    int teacherId;
    public teacher(String name, int age, String gender,int teacherId){
        super(name, age, gender);
        this.teacherId = teacherId;
    }
    void teach(){
        System.out.println(name+" is teaching.");
    }
}
public class EducationalSystem {
    public static void main(String[] args) {
        student s = new student("Pankaj Shahare", 25, "Male", 122001);
        teacher t = new teacher("Ashwin Bhalekar", 27, "Male", 120696);

        s.displayDetails();
        System.out.println("Student ID: " + s.studentId);
        s.study();

        System.out.println();

        t.displayDetails();
        System.out.println("Teacher ID: " + t.teacherId);
        t.teach();
    }
}
