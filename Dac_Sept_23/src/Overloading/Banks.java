/*
A person has his money deposited Rs 10000, Rs15000 and Rs2000 in banks-Bank
A, Bank B and Bank C respectively. We have to print the money deposited by him in a
particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three
subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name
'getBalance' which returns the amount deposited in that particular bank. Call the method
'getBalance' by the object of each of the three banks.
 */
package Overloading;
class Bank{
    int a;
    int getBalance(){
        a=0;
        return a;
    }
}
    class BankA extends Bank{
        int a=10000,b;
        int getBalance(){
             b=super.getBalance();
            System.out.println("The money deposited to BANK A="+(b+a));
            return 0;
        }
    }
class BankB extends Bank{
    int a=15000,b;
    int getBalance(){
        b=super.getBalance();
        System.out.println("The money deposited to BANK B="+(b+a));
        return 0;
    }
}
class BankC extends Bank{
    int a=20000,b;
    int getBalance(){
        b=super.getBalance();
        System.out.println("The money deposited to BANK C="+(b+a));
        return 0;
    }
}

    public class Banks{
        public static void main(String[] args) {
            BankA a= new BankA();
            a.getBalance();
             BankB b= new BankB();
            b.getBalance();
             BankC c= new BankC();
            c.getBalance();
            
        }
    
}
