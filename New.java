import java.util.*;

public class New {

    public static void main(String [] args){
        List<String> codinglanguages = new ArrayList<>();
        // adding elements to the list from the last by default
        codinglanguages.add("java");
        codinglanguages.add("python");
        codinglanguages.add("c++");    
        codinglanguages.add("javascript");


        // adding element at a specific index
        codinglanguages.add(2,"c**");
        codinglanguages.add(3,"c#");
        System.out.println(codinglanguages);


        // get element at a specific index
        System.out.println("The element at index 3 is: " + codinglanguages.get(3));



        // update element at a specific index
        codinglanguages.set(3,"js");
        System.out.println(codinglanguages);


        //delete element at a specific index
        codinglanguages.remove(5);
        System.out.println(codinglanguages);

        //sorting the list
        Collections.sort(codinglanguages);   
        System.out.println(codinglanguages);


        //size of the list
        System.out.println("The size of the list is: " + codinglanguages.size());


        // for each loop
        for(String language : codinglanguages ){
            System.out.println("Language: " + language);
        }
    }
}



