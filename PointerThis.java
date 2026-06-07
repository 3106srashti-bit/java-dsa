public class PointerThis {
    void display(int a , int b) {
        System.out.println("This is a method in the This class.");
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);
    }

    student(){
        this(10,20);
        System.out.println("This is a constructor in the This class.");
    }


     public static void main (String args[]){
        PointerThis obj = new PointerThis();
        obj.display(5, 10);
        
    }
}