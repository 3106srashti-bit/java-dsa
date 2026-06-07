import java.util.*;
public class Stream1 {
    public static void main(String[] args){
        // source data
        List<Integer> numbers = List.of(1,2,3,6,5,4);
        System.out.println("keeping only the even numbers");
       
       
        numbers.stream()
        //intermediate operation
        .filter(n -> n % 2 == 0)
      
        //  terminal operation   
        .forEach(System.out::println);
        
    }
}
