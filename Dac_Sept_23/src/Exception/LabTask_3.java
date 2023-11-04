/*Q3. Create a user-defined exception class InsufficientFundException that extends
Exception. Write a Java program that simulates a bank account and throws an
InsufficientFundsException when trying to withdraw more money than the
account balance.*/
package Exception;

import java.util.Scanner;

class InsufficientFundException extends Exception{
    public InsufficientFundException(String msg){
        super(msg);
    }
}
public class LabTask_3 {
    void chkFund(){
        System.out.println("Enter amount that you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int wit = sc.nextInt();
        
        if(amt >= wit){
            System.out.println("Congrats, Amount Has been Successfully Withdraw");
        }else{
            try{
            throw new InsufficientFundException("Transaction Denied. You don't have enugh balance");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        LabTask_3 fund = new LabTask_3();
        fund.chkFund();
    }
}
