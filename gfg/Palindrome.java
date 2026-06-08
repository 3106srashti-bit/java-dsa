package gfg;

public class Palindrome {
    
    static boolean isPalindrome(String S) {
        String rev = "";
        for(int i = S.length()-1;i >= 0;i--){
            rev = rev + S.charAt(i);
        }
        if(S.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
