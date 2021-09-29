class Solution {
    public int reverse(int x) {
        long ans =0;
        long last_digit=0;
        if ((x > Math.pow(2,31) - 1) || (x<-1*Math.pow(2,31))){
            ans =0;
            return (0);
        }
        else if (x<0){
            x= x*(-1);
            while (x>0){
                last_digit =x%10;
                ans= ans*10 + last_digit;
                x=x/10;
            }
            if (-1*ans < (-1*Math.pow(2,31))){
                return (0);
            }
            else{
             
            return (int)(-1*ans);
            }
        }
        else{
            while (x>0){
                last_digit =x%10;
                ans= ans*10 + last_digit;
                x=x/10;
                
            }
            if (ans > Math.pow(2,31) - 1){
                return (0);
            }
            else {
                
            return (int)(ans);
            }
        }
    
    }
    
}