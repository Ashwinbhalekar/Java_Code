package objectMethods;
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Student stud = (Student)obj;
        return this.name.equals(stud.name) && this.age==stud.age;
    }

    @Override
    public String toString() {
        return "Name: "+ name +" Age"+ age +"\n";
    }
    
}
public class TestEqlsHashTostr {
    public static void main(String[] args) {
        Student s = new Student("Ashwin",27);
        Student s1 = new Student("Ashwin",27);
        System.out.println(s);
        //System.out.println(s==s1);
        System.out.println(s.equals(s1));
        //System.out.println(s.toString());
        System.out.println(s.hashCode());
    }
}
