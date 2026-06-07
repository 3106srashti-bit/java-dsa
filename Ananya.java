import java.util.*;

public class Ananya {
   public static void main(String[] args) {
    Map<Integer , String> students = new HashMap<>();
    students.put(1, "Ananya");
    students.put(2, "Anshul");
    students.put(3, "Anshu");
    students.put(1, "Anaya");
    System.out.println(students);

    System.out.println("the value of key 2 is: " + students.get(2)); // to get the value of key 2

    //for each loop to iterate through the map
    for(Map.Entry<Integer, String> entry : students.entrySet()){
        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        
    }
   }
}
