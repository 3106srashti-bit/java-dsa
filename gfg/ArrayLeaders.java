package gfg;

public class ArrayLeaders {
    /*import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                ar.add(arr[i]);
            }
        }

        return ar;
    }
}*/

import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = arr[arr.length - 1];
        leaders.add(maxRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders.add(arr[i]);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}
}
