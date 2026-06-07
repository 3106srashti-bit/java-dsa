public class Car {
    int speed;
    String color;

    void drive(){
        System.out.println("The car is driving at 100 km/h");
    }


    public static void main(String args[]){
        Car obj = new Car();
        obj.drive();
    }
}
