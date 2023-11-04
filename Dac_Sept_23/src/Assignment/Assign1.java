/*1.Build a class which has references to other classes. Instantiate these reference variables and
invoke instance methods.*/
package Assignment;
class Student{
    private String name;
    private College college;
    
    public Student(String name, College college){
        this.name = name;
        this.college = college;
    }
    void studInfo(){
        System.out.println("Name of Student "+ name);
    }

    public College getCollege() {
        return college;
    }
    
}
class College{
    private String collegeName;
    
    public College(String collegeName){
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }
    
    
//    @Override
//    public String toString(){
//       return collegeName;
//    }
}
public class Assign1 {
    public static void main(String[] args) {
        College c = new College("Soft Polynomials");
        Student s = new Student("Akshay Wabhle",c);
        s.studInfo();
        System.out.println("Name of college "+s.getCollege().getCollegeName());
    }
    
}
