import java.util.*;
public class Function4 {
    public static int factorial(int n){
        if(n == 0){
            return 1;
 }else if(n < 0){
            return -1; 
        }
        int factorial = n;
        for(int i = n - 1; i > 0; i--){
         factorial *= i;
 }
        return factorial;
 }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = factorial(n);
    System.out.println("factorial is: " + result);
 } 
}
