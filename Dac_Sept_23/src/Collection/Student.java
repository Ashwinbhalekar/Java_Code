package Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
class studentSortingByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
     }
} 

public class Student implements Comparable<Student> {
   private int Id;
   private String name;
   private int age;

    public Student(int Id,String name, int age) {
        this.Id = Id;
        this.name = name;
        this.age = age;
    }
        @Override
    public int compareTo(Student o) {
        return this.age-o.age; 
    }

    @Override
    public String toString() {
        return "Id: "+Id+ " Name "+name+" Age "+age+ "\n";
    }

    public int getId() {
        return Id;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        Student s1 = new Student(103,"Shubham",27);
        Student s2 = new Student(101,"Ashwin",27);
        Student s3 = new Student(104,"Manish",25);
        Student s4 = new Student(102,"Mihir",21);
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        Collections.sort(v);       //Comparable sorting
        
        //studentSortingByName ssbn = new studentSortingByName();
        //Collections.sort(v, ssbn);     //Comparator sorting
        
        //System.out.println(v);
//        System.out.println(v.get(1).getName());
//        System.out.println(v.get(1).getAge());
//        System.out.println(v.get(1).getId());
        Iterator<Student> it = v.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println("Id: "+s.getId()+" Name: "+s.getName()+" Age: "+s.getAge());
        }
        
        
    }
}
