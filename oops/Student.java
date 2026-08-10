package oops;

public class Student {
    int rollno;
    String name;
    char grade;

    void display() {
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.rollno = 11;
        s1.name = "srashti";
        s1.grade = 'A';

        s1.display();
        
    }
    
}