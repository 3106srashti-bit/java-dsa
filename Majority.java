
/*class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
        return nums[nums.length / 2];

        }
      
    }*/
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
    

/*import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {

            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
         int max = 0;
         for(int freq : map.values()){
            if(freq > max){
                max = freq;
            }
         }

    
        int answer = 0;
        for (int freq : map.values()) {
            if (freq == max) {
                answer += freq;
            }
        }

        return answer;
    }
}

*/
import java.util.*;
class Majority {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            int g = target - nums[i];
            if (map.containsKey(g)){
                return new int[] {map.get(g), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
    
