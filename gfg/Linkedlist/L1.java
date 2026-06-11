package Linkedlist;
import java.util.*;
public class L1 {
public static void main(String [] args){
    LinkedList<Integer> G = new LinkedList<>();
    G.add(5);
    G.add(3);
    G.add(4);
    G.add(1);
    System.out.println(G);
    G.set(2 , 6);
    System.out.println(G);
   
    

    for(int i = 0; i < G.size(); i++){
        System.out.print(G.get(i) + " ");
    }
    System.out.println();
    
    
}
    
}
