/*Q2.Write a java program to Create a menu-driven interface for managing
student grades. Users can perform the following tasks:
1. Add students
2. Update grades
3. Remove students
4. View individual grades
5. List all students and grades
6. Calculate the average grade for all students.
Use HashMap to store student names and grades.*/
package Collection.Map;

import java.util.HashMap;
import java.util.Scanner;

public class studentGrade {
    static HashMap<String, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        

//        //Adding Students
//        hm.put("Ashwin","A+");
//        hm.put("Saorabh","A");
//        hm.put("Mihir","B+");
//        hm.put("Manish","B");
//        hm.put("Nikhil","C+");
//        System.out.println(hm);
//        
//        //Update Grade
//        hm.replace("Nikhil", "A");
//        System.out.println(hm);
//        
//        //Remove Student
//        hm.remove("Manish");
//        System.out.println(hm);
//        
//        //View Individual grades
//       // System.out.println(hm.get());
//        
//        //List all students and grades
//        for(String s:hm.keySet()){                     //Accessing the data using keySet in for each loop
//            String val = hm.get(s);
//            System.out.println("Student: "+s+" Grade: "+val);
//        }
//    }
        Scanner sc = new Scanner(System.in);
   
        int i = 0;

        while (i != 7) {
            System.out.println("1.Add Student");
            System.out.println("2.Update Grades");
            System.out.println("3.Remove Student");
            System.out.println("4.View Individual grade");
            System.out.println("5.List Of all Students with grades");
            System.out.println("6. Calculate the average grade for all students.");
            System.out.println("Exit");
            System.out.println("Enter your choice: ");
            i = sc.nextInt();

            switch (i) {
                case 1:
                    addStud();
                    break;
                case 2:
                    updateGrade();
                    break;
                case 3:
                    removeStud();
                    break;
                case 4:
                    individualGrade();
                    break;
                case 5:
                    showStud();
                    break;
                case 6:
                    calAvg();
                    break;
                case 7:
                    System.out.println("Thank You!!!");
                    break;
                default:
                    System.err.println("Invalide choice...Please enter correct choice.");

            }
        }
        sc.close();
    }

    public static void addStud() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String name = sc.nextLine();
        System.out.println("Enter the grade of student: ");
        int grade = sc.nextInt();
        hm.put(name,grade);
        System.out.println("Student Added Successfully....");
    }
    public static void updateGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String name = sc.nextLine();
        if(hm.containsKey(name)){
            System.out.println("Enter new grades: ");
            int grade = sc.nextInt();
            hm.put(name, grade);
            System.out.println("Grades updated successfully.");
        }else{
            System.out.println("Please enter valid data.");
        }
    }
    public static void removeStud(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String name = sc.nextLine();
        if(hm.containsKey(name)){
            hm.remove(name);
            System.out.println("Student removed successfully.");
        }else{
            System.out.println("Please Enter valid data.");
        }
    }
    public static void individualGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String name = sc.nextLine();
        if(hm.containsKey(name)){
            System.out.println(name+" grade is "+hm.get(name));
        }else{
            System.out.println("Please enter valid data.");
        }
    }
    public static void showStud(){
        for(String s:hm.keySet()){
            Integer val = hm.get(s);
            System.out.println("Student name: "+s+" Grade: "+val);
        }
    }
    public static void calAvg(){
        double sum = 0;
        for(int grade : hm.values()){
            sum+=grade;
        }
        if(!hm.isEmpty()){
            double avg = sum / hm.size();
            System.out.println("Average grade for all students: "+avg);
        }else{
            System.out.println("Please enter valid data.");
        }
    }
}
