package codeforces;
import java.util.Scanner;
public class codeforce2228A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    

    while(t-- > 0){
        int n = sc.nextInt();
        int num0 = 0;
        int num1 = 1;
        int num2 = 2;

        for(int i = 0 ; i < n; i++){
            int x = sc.nextInt();
            if(x == num0){
                num0++;

            }else if(x == num1){
                    num1++;
                
                }else{
                    num2++;
                }


            }
              int ans = 0;
            int pairs = Math.min(num1 , num2);
            ans = pairs + num0 +(num1-pairs)/3 +(num2-pairs)/3;

        

            System.out.println(ans);

        }



    }
    }
  

