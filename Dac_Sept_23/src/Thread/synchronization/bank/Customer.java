package Thread.synchronization.bank;

import java.util.Scanner;

public class Customer implements Runnable{

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        synchronized (account) {
            
        System.out.println("Mr. "+name+" please enter Amount to withdraw ");
        int amount = sc.nextInt();
        
        if(account.isSufficientBalance(amount)){
            System.out.println(this.name+" is going to withdraw "+amount+" INR.");
            account.withdraw(amount);
        }else{
            System.err.println("Insufficient Blanace.");
        }
      }
    }
    
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }
    
}
