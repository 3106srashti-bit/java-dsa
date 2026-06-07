import java.util.*;
public class D {

   public static void main(String[] args) {
    Set<String> cars1 = new HashSet<>();
    Set<String> cars2 = new TreeSet<>();

 // adding elements to the set
    cars1.add("vol");cars1.add("bmw");cars1.add("audi");
   
    System.out.println(cars1);

   

   // adding element to the set of cars2
    cars2.add("vol");cars2.add("bmw");cars2.add("audi");
   
   System.out.println(cars2);
   // checking if the set contains a specific element (boolean)
   if (cars1.contains("vol")) {
    System.out.println("vol is present in the set");
   } else {
    System.out.println("vol is not present in the set");
   }

    // removing an element from the set
    cars1.remove("vol");
    System.out.println(cars1);
}
}