package gfg;

public class Mean {
    class Solution {
    public static int findMean(int[] arr) {
        int sum = 0;
        int mean;
        for(int i = 0;i < arr.length ; i++ ){
            sum += arr[i];
            
        }
        mean = sum / arr.length;
        return mean;
    }
}
}
