1class Pair{
2        int ele;
3        int dist;
4        Pair(int _ele,int _dist){
5            this.ele=_ele;
6            this.dist=_dist;
7        }
8    }
9class Solution {
10    public List<Integer> findClosestElements(int[] arr, int k, int x) {
11        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->{
12           if(a.dist ==b.dist) return b.ele - a.ele;
13            return b.dist- a.dist;
14        });
15        int n=arr.length;
16        for(int i=0;i<n;i++){//nlog(k)
17            int ele=arr[i];
18            int dist=Math.abs(ele-x);
19            q.add(new Pair(ele,dist));
20            if(q.size()>k) q.poll();
21        }
22        List<Integer> ans=new ArrayList<>();
23        while(q.size()>0){
24            Pair temp=q.poll();
25            ans.add(temp.ele);
26        }
27        Collections.sort(ans);//klog(k)
28        return ans;
29    }
30}