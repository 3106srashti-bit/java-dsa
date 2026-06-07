 class BankAccount {
    String accountHolder;
    String accountType;
    double balance;
    String dob; // date of birth

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        
    }
}

public class Account{
    public static void main(String[] args){
        //object1
        BankAccount accc1 = new BankAccount();   // used new to create memory for the object
        accc1.accountHolder = "Srashti";
        accc1.accountType = "Savings";
        accc1.balance = 1000.034;
        accc1.dob = "01/01/2000";

        accc1.displayDetails();
        System.out.println("Balance: " + accc1.balance);
        System.out.println("Date of Birth: " + accc1.dob);


        //object2
        BankAccount accc2 = new BankAccount();
        accc2.accountHolder = "Rahul";
        accc2.accountType = "Current";
        accc2.balance = 2000.0;
        accc2.dob = "02/02/1999";

        accc2.displayDetails();
        System.out.println("Balance: " + accc2.balance);
        System.out.println("Date of Birth: " + accc2.dob);
    }
}
