package oops;
//number of digits in a number
public class NOD {
    public static void main(String[] args) {
        int n = 12345;
        int i = 0;

        for (; n > 0; i++) {
            n = n / 10;
        }

        System.out.println("Number of digits in the number is: " + i);
    }
}