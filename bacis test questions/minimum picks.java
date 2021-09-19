// You are given an array of integers A of size N.
// Return (the maximum among all even numbers of A) - (the minimum among all odd numbers in A).
import java.lang.Math.*;
public class Solution {
    public int solve(int[] A) {
        int n= A.length;
        int evenmax= A[0];
        int oddmin= A[0];
        for (int i=1; i<(n); i++){
            if((A[i]>evenmax || evenmax%2 != 0) && A[i]%2==0){
                evenmax=A[i];
                }
            else if ((A[i]<oddmin || oddmin%2 == 0) && A[i]%2!=0){
                oddmin= A[i];
                }
            }
            return (evenmax-oddmin);
        }
}    
