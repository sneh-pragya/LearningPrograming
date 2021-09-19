public class Solution {
    public int solve(int[] A, int B) {
        
      int n= A.length;
      int count=0;
      boolean targetpresent = false;
      for (int i=0; i<n; i++){
         
          if (A[i]!=B){
              targetpresent = false;
          }
          
          else if(A[i]==B){
              targetpresent = true;
              for (i=0; i<n; i++){
                    if (A[i]>B){
                        count+=1;
                    }
                }
            }
        }
    if (targetpresent){  
        return (count); 
    }
    else {
        return (-1);
    }
    }
}

// Little Ponny is given an array, A, of N integers. 
// In a particular operation, he can set any element of the array equal to -1.
// He wants your help for finding out the minimum number of operations required 
// such that the maximum element of the resulting array is B. 
//If it is not possible then return -1.