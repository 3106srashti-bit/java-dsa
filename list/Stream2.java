package list;
import java.util.*;
import java.util.stream.Collectors;

public class Stream2 {

    public static void main(String[] args) {

        List<String> rawData = List.of("apple", "banana", "kiwi");

        // created a new list using previous list
        List<String> onlyAwords = rawData.stream()

                .filter(word -> word.startsWith("a"))

                .collect(Collectors.toList());

        System.out.println("Original list: " + rawData);

        System.out.println("New list: " + onlyAwords);
    }
}