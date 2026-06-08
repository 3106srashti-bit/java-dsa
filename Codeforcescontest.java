import java.util.Scanner;
public class Codeforcescontest {
    int count = 0;
    int sum = 0;
int countRed(int[] arr){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > 0){
            count++;
            sum += arr[i];
        }
    }
    return count;
}
int countBlue(int[] arr){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            count++;
            sum += arr[i];
        }
    }
    return count;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Codeforcescontest obj = new Codeforcescontest();
        int redCount = obj.countRed(arr);
        int blueCount = obj.countBlue(arr);
        if(obj.sum > 0 && redCount < blueCount){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
}