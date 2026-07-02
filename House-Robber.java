1class Solution {
2    // int f(int i, int [] nums, int[] dp){
3    //     if(i==0) return nums[0];
4    //     if(dp[i]!=-1) return dp[i];
5    //     int not_pick = 0 + f(i-1, nums, dp);
6    //     int pick =nums[i];
7    //     if(i>=2) pick += f(i-2, nums, dp);
8    //     return dp[i]=Math.max(pick, not_pick);
9    // }//memoization
10    public int rob(int[] nums) {
11        int n = nums.length;
12        int [] dp = new int[n];
13         dp[0]=nums[0];
14         for(int i=1;i<=n-1;i++){
15           int not_pick = 0 + dp[i-1];
16           int pick =nums[i];
17           if(i>=2) pick += dp[i-2];
18           dp[i]=Math.max(pick, not_pick);
19         }
20         int ans=dp[n-1];
21        // int ans = f(n-1, nums, dp);
22        return ans;//tabulation
23    }//tc:O(N) //SC:O(N)
24}