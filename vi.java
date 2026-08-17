/*import java.util.*;
public class vi {
    public static void main(String[] args){
         // print 5 stars in two lines
      /*   for(int i = 0; i < 5; i++){
                System.out.println("*****");
            }
           }
            
            }*/
           /*int n = 12345;
            int i = 0;
            for(; n > 0; i++ ){
                n/=10;
            
        
            }
             System.out.print(i);

            square(3,5);



           
            
        
    }*/
 import java.util.*;

public class vi {
    public static void main(String[] args) {
        int result = power(3, 5);
        System.out.println("3^5 = " + result);
    }

    public static int power(int n, int m) {

        int ans = 1;
        for (int i = 1; i <= m; i++) {
            ans *= n;
        }
        return ans;
    }
}

