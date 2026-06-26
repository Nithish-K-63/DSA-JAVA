1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int l=0, r=n-1;
5        while(l<=r){
6            int mid = (l+r)/2;
7            if(nums[mid]==target) return mid;
8            if(nums[l]<=nums[mid]){
9                if(target>=nums[l] && target<nums[mid]){
10                    r=mid-1; // target must be in the left half
11                }else{
12                    l = mid+1; // target in the right half
13                }
14            }else{
15                if(target>nums[mid] && target<=nums[r]){
16                    l=mid+1;
17                }else r=mid-1;
18            }
19        }
20        return -1;
21    }
22}