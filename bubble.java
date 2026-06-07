import java.util.*;

public class bubble {
  public static void main(String[] args) {
    int arr[] = {6,8,4,7,2,1};
    int n = arr.length;

    for(int i = n - 1; i > 0; i--){
        for(int j = 0 ; j < i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
    
  }  
}
