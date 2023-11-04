/*Write a program to print the names of students by creating 
a Student class. If no name is passed while creating an object
of Student class, then the name should be "Unknown",
otherwise the name should be equal to the String value
passed while creating object of Student class.*/
package Overloading;
class cdac{
    String stuName;
       public cdac(){
        stuName = "UNKNOWN";
           System.out.println("Student Name: "+stuName);
        
    }
       public cdac(String x){
           stuName = "Ashwin";
           System.out.println("Student Name:"+stuName);
       }
}
public class CdacConst {
    public static void main(String[] args) {
        cdac c = new cdac();
        cdac c1 = new cdac("Ashwin");
    }
    
}
