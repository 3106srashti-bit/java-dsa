class Employ {
    String name = "hello";
    int empid = 25;
    int salary = 5666;

    void displayEmp() {
        System.out.println(name + " " + empid + " " + salary);
    }
}

class Manager extends Employ {
    String dept = "hr";
    int size = 25;

    void displayManager() {
        System.out.println(dept + " " + size);
    }
}

public class INHERIT2 {
    public static void main(String[] args) {

        Employ e;
        e = new Manager();

        
        e.displayEmp();
    }
}