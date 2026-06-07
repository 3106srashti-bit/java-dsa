import java.util.Scanner;
public class Eligible {
   public static void main(String[] args){
    Scanner sc = new Scanner
    (System.in);
    int age = sc.nextInt();
    sc.nextLine();
    
    String gender = sc.nextLine();
    if(age >= 18 && gender.equals("w")){
        System.out.println("eligible");
    }
    else{
        System.out.println("not eligible");
    }

    

   } 
    
}
