import java.util.Scanner;
public class Elseif {
   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int Grade = sc.nextInt();
    
    if(Grade <= 30 ){
        System.out.println("D");
    }
    else if(30 < Grade  && Grade <= 60){
        System.out.println("C");
    }
    else if(60 < Grade && Grade <= 70){
        System.out.println("B");
    }
    else if(70 < Grade  && Grade <= 90){
        System.out.println("A");
    
    }
    else{
        System.out.println("A+");
    }

    sc.close();

   } 
    
}