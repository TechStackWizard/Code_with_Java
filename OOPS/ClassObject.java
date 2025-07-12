package OOPS;

public class ClassObject {


    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.username ="Subhrat";
        b1.setPassword("testingPswd99"); 
        System.out.println(b1.username);
        System.out.println(b1.getAccountNumber());

        b1.deposite(100);
        System.out.println("Total balance is : " + b1.getBalance());
        
        b1.deposite(543);
        System.out.println("Total balance is : " + b1.getBalance());

        b1.withdraw(289);
        System.out.println("Total Balance is : "+ b1.getBalance());
        
    }
    
}

class BankAccount{
    public String username;
    private String password; //you can only change the password not to be access;
    private String accountNumber = "98738472636537";
    private int balance=0;


    void setPassword(String password){
        password = password;
    }

    String getAccountNumber(){
        return accountNumber;
    }

    void deposite(int amount){
        balance += amount;
        System.out.println(amount+", Added Successfully...");
    }
    
    void withdraw(int amount){
        balance -= amount;
        System.out.println(amount+", Withdraw Successfully...");
    }

    int getBalance(){
        int balance = 10;
        balance = balance + this.balance;
        return this.balance;
    }

}


