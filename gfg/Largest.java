package gfg;

public class Largest {
    class Solution {
    public static int largest(int[] arr) {
        int key = arr[0];
     for(int i = 0; i < arr.length ; i++){
        if(arr[i] > key){
       key = arr[i];
        
        }
     }
         return key;
     }
        
             
         }

    
   

}
