//You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.

class Solution:
    # @param A : integer
    # @return an integer
        def solve(self, A):
            sum=0;
            for i in range (1,A+1):
                if (i%2==0):
                    sum+= i
            
            return sum
    