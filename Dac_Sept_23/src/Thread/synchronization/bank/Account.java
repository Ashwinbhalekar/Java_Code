package Thread.synchronization.bank;
public class Account {
    private int balance = 10000;
    
     public boolean isSufficientBalance(int amount){
        if(balance>amount)
            return true;
        else
            return false;
    }
     
    public void withdraw(int amount){
            balance = balance-amount;
            System.out.println("Remaining Balance is "+balance+" INR");
        
    }
}
