1class Solution {
2    public long countSubarrays(int[] nums, long k) {
3        int n=nums.length;
4        int l=0;
5        long count=0,sum=0;
6        for(int r=0;r<n;r++){
7            sum+=nums[r];
8            while(sum*(r-l+1)>=k){
9                sum-=nums[l];
10                l++;
11            }count+=(r-l+1);
12        }return count;
13    }
14}