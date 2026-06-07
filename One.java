import java.util.*;

    //functional interface
    @FunctionalInterface
    interface Calculator{
        int operate(int a,int b);

    }
    class One{
        public static void main(String[] args){
            Calculator add = (a,b) -> a+b;//here a + b are method 
            Calculator sub = (a,b) -> a-b;
            Calculator mul = (a,b) -> a*b;
            Calculator div = (a,b) -> a/b;
            System.out.println("Addition: " + add.operate(5, 3));
            System.out.println("Subtraction: " + sub.operate(6, 3));
            System.out.println("Multiplication: " + mul.operate(9, 3));
            //input for division
            Scanner sc = new Scanner(System.in);
            System.out.println("enter dividend :");
            int dividend = sc.nextInt();
            System.out.println("enter divisor :");
            int divisor = sc.nextInt();
            /*if(div.operate(dividend, divisor) != 0){
                System.out.println(div.operate(dividend, divisor));
            }else{
                System.out.println("Division is not valid.");
            }*/
           // by exception handling
            try{
            int result = (div.operate(dividend , divisor));
            System.out.println("division" + result);
         
           }  catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }

           }
           
           

        }

