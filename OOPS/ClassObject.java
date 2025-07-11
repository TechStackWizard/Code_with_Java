package OOPS;

public class ClassObject {


    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.username ="Subhrat";
        b1.setPassword("soejkjlk"); 
        System.out.println(b1.username);
        
    }
    
}

class BankAccount{
    public String username;
    private String password; //you can only change the password not to be access;

    void setPassword(String pwd){
        password = pwd;
    }
}


