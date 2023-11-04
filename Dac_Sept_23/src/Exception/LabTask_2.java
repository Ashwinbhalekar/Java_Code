/*Q2. Create a user-defined exception class NegativeValueException that extends
Exception. Write a Java program that takes an integer as input and throws a
NegativeValueException if the input is a negative number.*/
package Exception;

import java.util.Scanner;

class NegativeValueException extends Exception{
    public NegativeValueException(String msg){
        super(msg);
    }
}
public class LabTask_2 {
    void chkValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("Number is Valid");
        }else{
            try{
                throw new NegativeValueException("This Value is negative. That's why this is not valid");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        LabTask_2 valid = new LabTask_2();
        valid.chkValues();
    }
}
