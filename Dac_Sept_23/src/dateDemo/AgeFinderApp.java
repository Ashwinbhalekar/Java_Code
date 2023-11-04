package dateDemo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeFinderApp {
    public static void main(String[] args) {
        System.out.println("Enter your date of birth(date/month/year): ");
        Scanner sc = new Scanner(System.in);
        String dob = sc.next();
        String arr[] = dob.split("/");
        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);
        
        LocalDate birthDate =  LocalDate.of(y, m, d);
        LocalDate today = LocalDate.now();  //For getting the six month ago date use today.minusMonth() 
        
        Period p = Period.between(birthDate, today);
        System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days");
    }
}
