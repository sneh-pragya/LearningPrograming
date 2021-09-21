class Solution:
    # @param A : string
    # @return a strings
        def solve(self, A):
            vowel=('aeiou')
            c =('')
            for i in range(len(A)):
                for j in range (5):
                    if A[i]== vowel[j]:
                        c+=vowel[j]
            return (c) 
            
            '''Return a string which is the longest subsequence of vowels in the string A.'''
            