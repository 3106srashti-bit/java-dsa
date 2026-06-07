import java.util.*;
public class ArrayColouring{
 // odd + odd = even
 //even + even = even
 // odd + even = odd
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while(n-->0){
        solve(sc);
    }
    sc.close();
    
}
