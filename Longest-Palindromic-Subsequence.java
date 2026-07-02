1// class Solution {
2//     int f(int i, int j, String s){
3//         if(i>j) return 0;
4//         if(i==j) return 1;
5//         if(s.charAt(i)==s.charAt(j)) return 2 + f(i+1, j-1, s);
6//         int left = f(i+1, j, s);
7//         int right = f(i, j-1, s);
8//         return Math.max(left, right);
9//     }
10//     public int longestPalindromeSubseq(String s) {
11//         int n = s.length();
12//         int ans = f(0, n-1, s);
13//         return ans;
14//     }
15// }
16class Solution {
17    int f(int i,int j,String s,int[][] dp){
18        if(i>j) return 0;
19        if(i==j) return 1;
20        if(dp[i][j]!=-1) return dp[i][j];
21        if(s.charAt(i)==s.charAt(j)){
22            return 2+f(i+1,j-1,s,dp);
23        }
24        int left=0+f(i+1,j,s,dp);
25        int rigth=0+f(i,j-1,s,dp);
26        return dp[i][j]=Math.max(left,rigth);
27    }
28    public int longestPalindromeSubseq(String s) {
29        int n=s.length();
30        int [][] dp=new int[n][n];
31        for(int [] row:dp){
32            Arrays.fill(row,-1);
33        }
34        int ans=f(0,n-1,s,dp);
35        return ans;
36    }
37}