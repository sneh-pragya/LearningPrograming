// Little Ponny and Palindromes with Hashing

public class Solution {
    public int solve(String A) {
        int[] hash = new int[26];
        for(int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            int index = (int)(ch-'a');
            hash[index]++;
        }
        int odd = 0;
        for(int i = 0; i < 26; i++) {
            if(hash[i]%2 != 0)
                odd++;
        }
        if(odd == 0 && A.length()%2 == 0)
            return 1;
        if(odd == 1 && A.length()%2 != 0)
            return 1;
        return 0;
    }
}