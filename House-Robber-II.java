1class Solution {
2     int f(int i, int [] nums, int[] dp){
3        if(i==0) return nums[0];
4        if(dp[i]!=-1) return dp[i];
5        int not_pick = 0 + f(i-1, nums, dp);
6        int pick =nums[i];
7        if(i>=2) pick += f(i-2, nums, dp);
8        return dp[i]=Math.max(pick, not_pick);
9    }
10    public int rob(int[] nums) {
11        int n = nums.length;
12        if(n==1) return nums[0];
13        int [] temp1 = new int[n-1];
14        int [] temp2 = new int[n-1];
15        for(int i =0; i<=n-2; i++) temp1[i] = nums[i];
16        for(int i=1; i<=n-1; i++) temp2[i-1] = nums[i];
17        int [] dp = new int[n-1];
18        Arrays.fill(dp,-1);
19        int a =f(n-2, temp1, dp);
20        Arrays.fill(dp,-1);
21        int b =f(n-2, temp2, dp);
22        return Math.max(a,b);
23    }
24}