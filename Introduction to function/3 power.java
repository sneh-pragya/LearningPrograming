//You are given two integers A and B.

//You have to find the value of A to the power B

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int power(final int A, final int B) {
        int power =1;
        for (int i=1; i<= B; i++){
            power= power*A;
        }
        return power;
    }
}
