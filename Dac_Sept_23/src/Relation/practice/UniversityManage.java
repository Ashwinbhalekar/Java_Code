/*Design a scenario related to a university with students, courses, and classrooms.
Implement the "Has-a" relationship by designing classes for the following entities:
Student: Represents a student with attributes like studentID, name, and coursesEnrolled.
Course: Represents a course with attributes like courseCode, courseName, and teacher.
Teacher: Represents a teacher with attributes like teacherID and name.
-Demonstrate "Association" by creating relationships between these classes. A student can be
associated with multiple courses. A course can have one teacher.
Show "Aggregation" by allowing a course to contain multiple students. In this scenario, students can be
added and removed from courses.
Illustrate "Composition" by allowing a university to contain classrooms. A classroom can have students.
When a classroom is destroyed, the students are removed from it.
Write a Java program that creates instances of these classes, establishes relationships, and performs
operations like enrolling students in courses and destroying classrooms.*/
import java.util.ArrayList;
import java.util.List;

class Student {
    protected int studentID;
    protected String name;
    protected List<Course> coursesEnrolled;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void dropCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    @Override
    public String toString() {
        return " "+ coursesEnrolled; 
    }
    
}

class Course {
    private int courseCode;
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    public Course(int courseCode, String courseName, Teacher teacher) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}

class Teacher {
    private int teacherID;
    private String name;

    public Teacher(int teacherID, String name) {
        this.teacherID = teacherID;
        this.name = name;
    }
}

class Classroom {
    protected List<Student> students;

    public Classroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void destroyClassroom() {
        students.clear();
    }
}


public class UniversityManage {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Anup Pardhi");
        Course javaCourse = new Course(101, "Java", teacher);
        Course adsCourse = new Course(102, "ADS", teacher);

        Student student1 = new Student(1001, "Ashwin");
        Student student2 = new Student(1002, "Mihir");

        student1.enrollCourse(javaCourse);
        student1.enrollCourse(adsCourse);
        student2.enrollCourse(javaCourse);

        Classroom classroom = new Classroom();
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        // Displaying sample operations
        System.out.println("Courses enrolled by " + student1 + ": " + student1.coursesEnrolled);
        System.out.println("Courses enrolled by " + student2 + ": " + student2.coursesEnrolled);
        System.out.println("Students in classroom: " + classroom.students);

        classroom.destroyClassroom();
        System.out.println("Classroom destroyed. Students in classroom: " + classroom.students);
    }
}

