//CHAR INDEX

class Solution:
    # @param A : string
    # @return a strings
    def solve(self, A):
        alpha = ('abcdefghijklmnopqrstuvwxyz')
        b=('')
        
        for j in range (len(A)):
            for i in range (26):
            
                if (A[j]== alpha[i]):
                     
                    b+=(A[j]+str(i+1))
    
        return (b)
    