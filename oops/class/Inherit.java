//extensibility ,reusable 
// constructors cant be inherited and private member cant be inherited 
//when over riding child class is given priority
//hierarchy = multiple child and one base 
//multilevel = one child class is the parent of other child class

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Inherit {
    public static void main(String[] args) {

        Animal m;
        m = new Dog();

        m.sound();
    }
}
