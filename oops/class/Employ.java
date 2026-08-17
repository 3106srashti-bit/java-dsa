import java.util.*;
public class Employ {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        
        e1.setId(101);
        e1.setName("Srashti");
        e1.setSalary(50000);

        
        System.out.println("ID: " + e1.getId());
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }
}

 class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


