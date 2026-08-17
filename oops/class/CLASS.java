

public class CLASS {
    public static void main(String[] args) {

        int n = 15;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = i;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
        }

        System.out.println("Sum is " + sum);
    }
}
