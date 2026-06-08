package gfg;

public class Missing {
    //class Solution {
   // int missingNum(int arr[]) {
    //    int max = arr[0];
    //    for (int i = 1; i < arr.length; i++) {
     //       if (arr[i] > max) {
     //           max = arr[i];
     //       }
     //   }
    //    int freq[] = new int[max + 2];

    //    for (int num : arr) {
     //       freq[num]++;
     //   }
     //   for (int i = 1; i < freq.length; i++) {
        //    if (freq[i] == 0) {
       //         return i;
       //     }
      //  }
      //  return -1;
   // }
//}



 //   int n = arr.length + 1;
       // int totalSum = 0;
        //for (int i = 1; i <= n; i++) {
          //  totalSum += i;
        //}
        //int arraySum = 0;
        //for (int num : arr) {
          //  arraySum += num;
    //    }
       // return totalSum - arraySum;

class Solution {
    int missingNum(int arr[]) {
       int xor1 = 0;
       int xor2 = 0;
       for(int i = 1 ; i <= arr.length + 1; i++){
           xor1^=i;
       } 
         for( int num : arr){
               xor2^=num;
         }
       int missing = xor1^xor2;
       return missing;
    }

}

}
