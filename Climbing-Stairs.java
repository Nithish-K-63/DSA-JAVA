1class Solution {
2    public int f(int n,int [] dp) {
3        if(n==1||n==2) return n;
4        if(dp[n]!=-1) return dp[n];
5        int one=f(n-1,dp);
6        int two=f(n-2,dp);
7        dp[n]=one+two;
8        return dp[n];
9    }
10     public int climbStairs(int n) {
11        int[] dp=new int[n+1];
12        Arrays.fill(dp,-1);
13        int ans=f(n,dp);
14        return ans;
15    }
16    
17}