/*Q1. .Write a java program to Create a collection of Employee class and sort
objects using comparable and comparator interfaces.*/
package Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
class sortComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    } 
}

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee Id: "+id+" Name: "+name;
    }

    public static void main(String[] args) {
        Vector<Employee> e = new Vector<>();
        Employee e1 = new Employee(121,"Saorabh");
        Employee e2 = new Employee(113,"Manish");
        Employee e3 = new Employee(117,"Nikhil");
        Employee e4 = new Employee(110,"Shitij");
        Employee e5 = new Employee(111,"Ashwin");
        
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);
        
        System.out.println(e);
        //Collections.sort(e);
        
        sortComparator sc = new sortComparator();
        Collections.sort(e, sc);
        
        for(Object o : e)
            System.out.println(o);
        
    }
}
