public class Bank {
    class Details{
        String name;
        int accNo;
        int balance;


        void display(){
            System.out.println("Name:"+ name);
            System.out.println("Account No:"+ accNo);
            System.out.println("Balance:"+ balance);
        }
    }

    void main(String[] args) {
        Details d1 = new Details();
        d1.name = "srashti";
        d1.accNo = 12345;
        d1.balance = 1000;
        d1.display();
        
    }
}
