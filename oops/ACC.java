package oops;

public class ACC {
    
    String accountNumber;
    double balance;

    
    ACC(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }


    public static void main(String[] args) {

        
        ACC account = new ACC("ACC101", 10000);

    
        account.deposit(5000);

        
        account.withdraw(3000);

        
        account.checkBalance();

        account.withdraw(15000);

        account.checkBalance();
    }
}