package contest;
import java.util.*;
public class contest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = 1;
        int r = n;
        while (t < r) {
            int mid = (t + r) / 2;
            long sum = 0;
            long curr = mid;
            while (curr > 0) {
                sum += curr;
                curr /= k;
            }
            if (sum >= n) {
                r = mid;
            } else {
                t = mid + 1;
            }
        }
        System.out.println(t);
        
    }
}


