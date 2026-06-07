import java.util.*;
public class NumberList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);

        numbers.add(4, 5);
        numbers.add(5, 4);
        numbers.add(6, 7);
        Collections.sort(numbers);
        System.out.println(numbers);




// for loop
        for(int i = 0; i < numbers.size(); i++){
            System.out.println("number: " + numbers.get(i));
        }

          System.out.println("the  size of the list is: " + numbers.size());


// for each loop
        for(Integer number : numbers){
            System.out.println("number: " + number);
        }
    }
}
