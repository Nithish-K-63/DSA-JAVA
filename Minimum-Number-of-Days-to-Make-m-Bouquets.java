1class Solution {
2    int f(int [] arr ,int day , int k){
3        int flowers_in_hand=0,b=0;
4        for(int i=0;i<arr.length;i++){
5            if(arr[i]<=day){
6                flowers_in_hand++;
7                if(flowers_in_hand==k){
8                    b++;
9                    flowers_in_hand=0;
10                }
11
12            }else flowers_in_hand=0;
13            
14        }
15        return b;
16    } 
17    public int minDays(int[] arr, int  m, int k) {
18        if((long)m*k>arr.length) return -1;
19        int n=arr.length;
20        int maxi=0;
21        for(int i=0;i<n;i++) if(arr[i]>maxi) maxi=arr[i];
22        int l=1, r=maxi;
23        while(l<=r){
24            int day = (l+r)/2;
25            int b = f(arr, day,k);
26            if(b<m) l=day+1;
27            else r=day-1;
28        }
29        return l; //O(Maxi*N);
30    }
31    
32}