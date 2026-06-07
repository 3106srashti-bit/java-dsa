public class Srashti {

     class Student {
        String name;
        int rollNo;
        int marks;
    }

     void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Srashti";
        s1.rollNo = 101;
        s1.marks = 95;

        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);

        Student s2 = new Student();
        s2.name = "Muskan";
        s2.rollNo = 102;
        s2.marks = 85;

        System.out.println("Name: " + s2.name);
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Marks: " + s2.marks);
    }
}