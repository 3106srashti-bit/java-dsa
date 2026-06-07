class BankAccount {

    String accountHolder;
    String accountType;
    double balance;
    String dob;

    public BankAccount(String HolderName, String account,
                       double amount, String birthDate) {

        accountHolder = HolderName;
        accountType = account;
        balance = amount;
        dob = birthDate;
    }

    void displayDetails() {

        System.out.println(
            "Balance: " + balance +
            ", Date of Birth: " + dob +
            ", Account Holder: " + accountHolder +
            ", Account Type: " + accountType
        );
    }
}

public class C {

    public static void main(String[] args) {

        BankAccount accc1 =
            new BankAccount(
                "Srashti",
                "Savings",
                1000.034,
                "01/01/2000"
            );

        accc1.displayDetails();
    }
}