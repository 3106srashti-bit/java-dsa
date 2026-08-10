package oops;
import java.util.*;
public class Cons {
    //default constructor
    public Cons(){
    System.out.println("This is default constructor");
    }


    // copy constructor and parameter constructor
    public Cons(int a){
    System.out.println("This is parameter constructor");
    }

    public Cons(Cons c){
    System.out.println("This is copy constructor");
}

    public static void main(String args[]){
    Cons c1 = new Cons();
    Cons c2 = new Cons(5);
    Cons c3 = new Cons(c2);
}
}
//constructor overloading


