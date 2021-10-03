//https://leetcode.com/problems/richest-customer-wealth/
//You are given an m x n integer grid accounts where accounts[i][j] is 
//the amount of money the ith customer has in the jth bank.
//Return the wealth that the richest customer has.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        //System.out.println(m);
        int ans=0;
        int sum=0;
        for (int i=0;i< m;i++){
            sum=0;
            int n = accounts[i].length;
           // System.out.println(n);
            for (int j=0;j< n;j++){
                sum += accounts[i][j]; 
            }
            ans= Math.max(sum,ans);
        }
         return (ans);   
    }
}