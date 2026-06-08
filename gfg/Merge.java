package gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    class Solution {
    void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }
    void merge(int[] arr, int left, int mid, int right) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i++]);
            } else {
                temp.add(arr[j++]);
            }
        }
        while (i <= mid) temp.add(arr[i++]);
        while (j <= right) temp.add(arr[j++]);
        for (int k = 0; k < temp.size(); k++) {
            arr[left + k] = temp.get(k);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 6, 4};
        Solution obj = new Solution();
        obj.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
}
