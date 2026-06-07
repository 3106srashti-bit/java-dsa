import java.util.*;

class Student {

    String name;
    int id;
    int marks;

    Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Marks: " + marks +
               ", Name: " + name;
    }
}

class Comparators {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(45, 90, "Srashti"));
        students.add(new Student(1, 70, "Aman"));
        students.add(new Student(10, 95, "Riya"));
        students.add(new Student(7, 80, "Kunal"));

        // Sorting by marks
        Collections.sort(students,
                (s1, s2) -> Integer.compare(s1.marks, s2.marks));

        System.out.println("Sorted by Marks:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}