package gfg;

public class Subarray {
    class Solution {
    public int maxSubarraySum(int[] arr, int k) {
    int sum = 0;
    for(int i = 0 ; i < k ;i++){
        sum+=arr[i];
    }
    int maxi = sum;
    for(int i = k ; i < arr.length ; i++){
    sum = sum + arr[i] - arr [i - k];
    maxi= Math.max(maxi , sum);
    }
          return maxi;  
}
}

}
