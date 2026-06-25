1class Solution {
2    int f(int[] nums, int k){
3        if(k<0) return 0;
4        int n=nums.length;
5        int l=0, cnt=0, odd=0;
6        for(int r=0; r<n; r++){
7            if(nums[r]%2==1) odd++;
8            while(odd>k){
9                if(nums[l]%2==1) odd--;
10                l++;
11            }
12            cnt+=(r-l+1);
13        }
14        return cnt;
15    }
16    public int numberOfSubarrays(int[] nums, int k) {
17        return f(nums,k)-f(nums,k-1);
18    }
19}