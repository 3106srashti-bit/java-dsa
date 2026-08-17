package codeforces;
import java.util.*;
public class Codeforcescontest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int ans = 0;
            for(int i = 2; i < n; i++){
                if(arr[i] - arr[i-1] == arr[i-1] - arr[i-2]){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }  
 //this code reads multiple test cases, where for each test case it takes an integer `n` and an array of `n` integers. It sorts the array and counts how many times three consecutive elements form an arithmetic progression (i.e., the difference between the first and second element is the same as the difference between the second and third element). Finally, it prints the count for each test case.

    
}
