/*import java.util.*;
public class Prefix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum;
            if (l == 0) {
                sum = prefixSum[r];
            } else {
                sum = prefixSum[r] - prefixSum[l - 1];
            }
            System.out.println(sum);
        }
    }
}
//optimizes version
/*import java.util.*;
public class Prefix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = prefixSum[r] - (l > 0 ? prefixSum[l - 1] : 0);
            System.out.println(sum);
        }
    }
}*/ 

import java.util.*;

public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int q = sc.nextInt(); 
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            l = l - 1;
            r = r - 1;
            int ans;
            if (l == 0) {
                ans = prefix[r];
            } else {
                ans = prefix[r] - prefix[l - 1];
            }
            System.out.println(ans);
        }
    }
}