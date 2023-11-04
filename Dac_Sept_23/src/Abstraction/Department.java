/*Q3. Design a Java program that demonstrates the concept of abstraction by creating an abstract class
Employee and implementing it in two concrete subclasses: Manager and Technician.
Create an abstract class Employee with the following abstract methods:
calculateSalary(): To calculate the salary of the employee.
displayDetails(): To display the details of the employee.
Create concrete subclasses Manager and Technician that extend the Employee class and implement the
abstract methods.
In the Main class, create instances of both Manager and Technician, calculate and display their
respective salaries and details*/
package Abstraction;
abstract class Employee{
   
    private String name;
    private int Id;
    public Employee(String name,int Id){
        this.name = name;
        this.Id = Id;
    }
    public String getName(){
        return name;
    }
    public int getid(){
        return Id;
    }
    abstract double calculateSalary();
    abstract void displayDetails();
}
class Manager extends Employee{
    private double sal;
    private double bonus;
    public Manager(String name,int Id, double sal, double bonus){
        super(name, Id);
        this.sal = sal;
        this.bonus = bonus;
    }
    @Override
    double calculateSalary(){
        return (sal+bonus);
    }
    void displayDetails(){
        System.out.println("Details of manager");
        System.out.println("Name of manager: "+getName());
        System.out.println("ID of manager: "+getid());
        System.out.println("Basic Salary: "+sal);
        System.out.println("Bouns: "+bonus);
    }
}
class Technician extends Employee{
        private double sal;
    private double bonus;
    public Technician(String name,int Id, double sal, double bonus){
        super(name, Id);
        this.sal = sal;
        this.bonus = bonus;
    }
    @Override
    double calculateSalary(){
        return sal+bonus;
    }
    void displayDetails(){
        System.out.println("Details of Technician");
        System.out.println("Name of technician: "+getName());
        System.out.println("ID of technician: "+getid());
        System.out.println("Basic Salary: "+sal);
        System.out.println("Bouns: "+bonus);
    }
}
public class Department {
    public static void main(String[] args) {
        Manager m = new Manager("Pankaj Shahare", 12,100000, 5000);
        Technician t = new Technician("Ashwin Bhalekar", 27,50000, 2500);
         
        m.displayDetails();
        System.out.println("Salary of manager: "+m.calculateSalary());
       
        
        t.displayDetails();
        System.err.println("Salary of Technician: "+t.calculateSalary());
       
    }
}
