public class Inheritance {
    class Animal {
    
    void eat() {
        String name = "cat";
        System.out.println(name + " eats");
        System.out.println("Animal eats");
    }
}

class Dog extends Animal { // Dog inherits Animal
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Dog{
    Cat(){
        super();
    }
    void play(){
        System.out.println("Cat plays");
        super.eat();
    }
}

void main(){
    Cat obj = new Cat();
    obj.eat();
    obj.bark();
    obj.play();
    
}

}

