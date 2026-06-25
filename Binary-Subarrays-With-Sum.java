1class Solution {
2    int f(int [] nums, int k){
3        int n=nums.length;
4        int l=0, cnt=0, sum=0;
5        for(int r=0; r<n; r++){
6            sum+=nums[r];
7            while(sum>k && l<=r){
8                sum-=nums[l];
9                l++;
10            }
11            cnt+=(r-l+1);
12        }
13        return cnt;
14    }
15    public int numSubarraysWithSum(int[] nums, int goal) {
16        return f(nums,goal)-f(nums,goal-1);
17    }
18}