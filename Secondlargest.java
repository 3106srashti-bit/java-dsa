import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
    int max = 0;
    int secondmax = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            secondmax = max;
            max = arr[i];
        } else if (arr[i] > secondmax && arr[i] != max) {
            secondmax = arr[i];
            max = arr[i];
        }
    }
    return secondmax;
}
}