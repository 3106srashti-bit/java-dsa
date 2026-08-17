public class Heirarchal {
    public static void main(String[] args) {

        Animal m;

        m = new Dog();
        m.sound();

        m = new Cat();
        m.sound();
    }
}  
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

class Cat extends Animal {
    
    void sound() {
        System.out.println("Cat meows");
    }
}

