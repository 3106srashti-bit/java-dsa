import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        // Calculate sum
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Output
        System.out.println(sum);

        sc.close();
    }
}