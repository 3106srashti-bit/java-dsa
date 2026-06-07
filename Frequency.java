import java.util.*;

public class Frequency {
 
   public static void main(String[] args) {
   List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(1);
    list.add(3);
    list.add(1);
    list.add(4);
    list.add(1);
    list.add(1);
    list.add(6);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);


    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (Integer num : list){
        if (frequencyMap.containsKey(num)) {
            frequencyMap.put(num, frequencyMap.get(num) + 1);
        } else {
            frequencyMap.put(num, 1);
        }
    }
   /*  System.out.println("Frequency of each element in the list:");
     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
    */
  // number of elements in the list that have frequency greater than 1
    int count = 0;
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() > 1) {
            count++;
        }
    }
    System.out.println("Number of elements with frequency greater than 1: " + count);
}

}



