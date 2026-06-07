import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        int[] fib = new int[n];
        System.out.println(fib[0] = 0);
        System.out.println(fib[1] = 1);
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
    }
}

