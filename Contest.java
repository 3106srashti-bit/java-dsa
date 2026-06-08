import java.util.*;
public class Contest {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i = i+2){
              arr[i] = x;                
            }
            for(int i = 1; i < n; i = i+2){
                arr[i] = -1*x;
            } 
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i];
            }
            System.out.println(sum);
        }


    }
}



        