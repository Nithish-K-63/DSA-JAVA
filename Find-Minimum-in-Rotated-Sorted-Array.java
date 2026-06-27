1class Solution {
2    public int findMin(int[] nums) {
3        //Arrays.sort(nums);
4        //return nums[0];
5        int n = nums.length;
6        int l=0, r=n-1;
7        int min = Integer.MAX_VALUE;
8        while(l<=r){
9            int mid = (l+r)/2;
10            if(nums[l]<=nums[mid]){
11                if(nums[l]<min) min = nums[l];//smallest element in left
12                l=mid+1;
13            }else{
14                if(nums[mid]<min) min=nums[mid];//smalest element in 
15                                                // right
16                r=mid-1;
17            }
18        }
19        return min;
20    }
21}