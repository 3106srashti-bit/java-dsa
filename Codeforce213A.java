import java.util.Scanner;

public class Codeforce213A {
    public static void main(String[] args) {
        int count = 0 ;
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();


        for(int i = 0 ; i < n ; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        
        if(a + b + c >= 2){
            count++;
        }
        }
System.out.println( count);

    }
}
