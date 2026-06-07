import java.util.*;
public class Methods {
   // containsAll() method to check if a collection contains all elements of another collection 
   public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list2.add(2);
    list2.add(3);
    list2.add(4);
    System.out.println(list1.containsAll(list2)); 


    //retainAll() method to remove all elements from a collection that are not present in another collection
    List<Integer> list3 = new ArrayList<>();
    list3.add(1);
    list3.add(2);
    list3.add(3);
    list3.retainAll(list2); /// this will remove 1 from list3 because it is not present in list2 and print the intersection  
    System.out.println(list3); 



    //removeAll() method to remove all elements from a collection that are present in another collection
    List<Integer> list4 = new ArrayList<>();
    list4.add(1);
    list4.add(2);
    list4.add(3);
    list4.removeAll(list2); /// this will remove 2 and 3 from list4 because they are present in list2
    System.out.println(list4); 
}
}