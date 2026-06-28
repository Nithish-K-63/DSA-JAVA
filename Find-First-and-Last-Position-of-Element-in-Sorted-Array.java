1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int res[]=new int[2];
4        res[0]=LeftBit(nums,target);
5        res[1]=RightBit(nums,target);
6        return res;
7    }
8   
9    int LeftBit(int[] nums,int target)
10    {
11        int l=0,r=nums.length-1,mid=0,res=-1;
12        while(l<=r)
13        {
14            mid=l+(r-l)/2;
15            if(nums[mid]==target)
16            {
17                res=mid;
18            }
19            if(nums[mid]>=target)
20            {
21                r=mid-1;
22            }
23            else
24            {
25                l=mid+1;
26            }
27        }
28        return res;
29    }
30    int RightBit(int[] nums,int target)
31    {
32        int l=0,r=nums.length-1,mid=0,res=-1;
33        while(r>=l)
34        {
35            mid=l+(r-l)/2;
36            if(nums[mid]==target)
37            {
38                res=mid;
39            }
40            if(nums[mid]<=target)
41            {
42                l=mid+1;
43            }
44            else
45            {
46                r=mid-1;
47            }
48        }
49        return res;
50    }
51}