package contest;
import java.util.*;
public class contest1 {
     public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ML = 1;
        int P = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                P++;
            } else {
                ML = Math.max(ML, P);
                P = 1;
            }
        }
        ML = Math.max(ML, P);
        System.out.println(ML);
    }
}
