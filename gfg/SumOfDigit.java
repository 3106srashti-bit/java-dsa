package gfg;

public class SumOfDigit {
    class Solution {
    static int sumOfDigits(int n) {
        int sum = 0;
        int temp = n;
        while(n>0) {
            temp = n % 10;
            
            sum = sum + temp;
            
            n = n/10;
        }
         return sum;
        
    }
    
    }

}
