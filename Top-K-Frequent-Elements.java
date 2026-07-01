1class Solution {
2    class Pair{
3    int ele;
4    int freq;
5    Pair(int _ele,int _freq){
6        this.ele=_ele;
7        this.freq=_freq;
8    }
9    }
10    public int[] topKFrequent(int[] nums, int k) {
11        //freq map;
12        HashMap<Integer,Integer> mp=new HashMap<>();
13        int n=nums.length;
14        for(int i=0;i<n;i++){
15            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
16        }
17        //k largest ->min heap
18        PriorityQueue<Pair> q=new PriorityQueue <>((a,b)->{
19            return a.freq-b.freq;
20        });
21        for(var it:mp.entrySet()){
22            int ele=it.getKey();
23            int freq=it.getValue();
24            q.add(new Pair(ele,freq)); //q.add(nums[i])
25            if(q.size()>k) q.poll();
26        }int[] ans=new int[k];
27        int i=0;
28        while(q.size()>0){
29            Pair temp=q.poll();
30            ans[i]=temp.ele;
31            i++;
32        }return ans;
33    }
34}