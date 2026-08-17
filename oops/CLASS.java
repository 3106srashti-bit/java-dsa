package oops;

public class CLASS {
    public static void main(String[] args) {

        int n = 12;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }

        System.out.println("Sum is " + sum);
    }
}