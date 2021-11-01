//Primal power
//"Primal Power" of an array is defined as the count of prime numbers present in it.
//Given an array of integers A of length N, you have to calculate its Primal Power.

public class Solution {
    public int solve(int[] A) {
        int count = 0; 
        for (int i = 0; i < A.length; i++){
            boolean bool = true;
            if (A[i]>1){
                for (int j=2; j*j <= A[i]; j++){     
                    if (A[i] % j == 0){
                        bool = false;
                        break;
                    }
                }
                if (bool == true){
                    count += 1;
                }
            }
        }
        return (count);
    }
}