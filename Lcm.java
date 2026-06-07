class Solution {
    public int Lcm(int a, int b) {
     int temp;
     int lcm;
        if(a > b){
            temp = a;
        }else{
            temp = b;
        }
        while(true){
            if(temp % a == 0 && temp % b == 0){
                lcm = temp;
                break;
            }
            temp++;

        }
        return lcm;
        }
    } 
      
    
    