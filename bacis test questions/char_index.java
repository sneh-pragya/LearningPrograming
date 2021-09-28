//char index


public class Solution {
    public String solve(String A) {
        
       String alpha = ("abcdefghijklmnopqrstuvwxyz");
        String b=("");
        
        for(int j=0; j<A.length(); j++){
            for (int i=0; i<26; i++){
            
                if (A.charAt(j)== alpha.charAt(i)){
                     
                    b+=(A.charAt(j)+Integer.toString(i+1));
                }
            }
        }
    return (b);
    }
}