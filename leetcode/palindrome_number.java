//https://leetcode.com/problems/palindrome-number/

//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward. 
//For example, 121 is palindrome while 123 is not.
class Solution {
    public boolean isPalindrome(int x) {
        long old_number = x;
        long  new_number=0;
        long last_digit= 0;
        if ((x > Math.pow(2,31) - 1) || x<0 || (x<-1*Math.pow(2,31))){
            return (false);
        }
        
        while(x>0){   
            last_digit = x%10;
            new_number = new_number*10 + last_digit;
            x = x/10;
        }
        
        if (new_number > Math.pow(2,31) - 1){
                return (false);
            }
        if (old_number == new_number){
            return (true);
        }
        else {
            return (false);
        }
        
    }
}
