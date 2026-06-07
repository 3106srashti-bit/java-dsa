import java.util.*;
public class Function5 {
    public static void prime(int n){
       boolean isPrime = true;
        if (n <= 1){
            System.out.println("Not a prime number");
            return; 
        }
        for(int i = 2 ; i < n; i ++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
 }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    prime(n);
 } 
}

