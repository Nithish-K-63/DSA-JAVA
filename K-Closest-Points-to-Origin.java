1class Trio{
2    int dist;
3    int x;
4    int y;
5    Trio(int dist, int x, int y){
6        this.dist = dist;
7        this.x = x;
8        this.y =y;
9    }
10}
11class Solution{
12    public int [][] kClosest(int [][] points, int k){
13        PriorityQueue<Trio> q = new PriorityQueue<>((a,b)->{
14            return b.dist - a.dist;
15        });
16        int n = points.length;
17        for(int i=0; i<n ;i++){
18            int x1= points[i][0];
19            int y1= points[i][1];
20            int dist = x1*x1 + y1*y1;
21            q.add(new Trio(dist, x1, y1));
22            if(q.size()>k){
23                q.poll();
24            }
25        }
26        int i=0;
27        int [][] ans = new int[k][2];
28        while(q.size()>0){
29            Trio temp = q.poll();
30            ans[i][0] = temp.x;
31            ans[i][1] = temp.y;
32            i++;
33        }
34        return ans;
35    }
36}
37