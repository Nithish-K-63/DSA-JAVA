1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->{
4            return a-b;
5        });
6        for(int i=0; i<nums.length; i++){//O(N)
7            q.add(nums[i]);//O(log(K))
8            if(q.size()>k) q.poll();
9        }
10        return q.peek();
11    }//O(nlog(K))
12}