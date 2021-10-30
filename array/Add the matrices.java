//https://www.scaler.com/academy/mentee-dashboard/class/10513/assignment/problems/11616
//Add the matrices

public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[0].length; j++){
                A[i][j]= A[i][j]+B[i][j];
            }
        }
        return(A);
    }
}
