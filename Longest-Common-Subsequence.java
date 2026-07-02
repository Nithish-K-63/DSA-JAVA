1// recussion
2//class Solution {
3//     int f(int i, int j, String s, String t){
4//         if(i<0 || j<0) return 0;
5//         if(s.charAt(i)==t.charAt(j)) return 1+f(i-1, j-1, s, t);
6//         int left = 0 + f(i-1, j, s, t);
7//         int right = 0 + f(i, j-1, s, t);
8//         return Math.max(left,right);
9//     }
10//     public int longestCommonSubsequence(String s, String t) {
11//         int m = s.length(), n = t.length();
12//         int ans = f(m-1, n-1, s, t);
13//         return ans;
14//     }
15// }
16//dp
17class Solution {
18    int f(int i, int j, String s, String t, int [][] dp){
19        if(i<0 || j<0) return 0;
20        if(dp[i][j]!=-1) return dp[i][j];
21        if(s.charAt(i)==t.charAt(j)) return 1+f(i-1, j-1, s, t, dp);
22        int left = 0 + f(i-1, j, s, t, dp);
23        int right = 0 + f(i, j-1, s, t, dp);
24        return dp[i][j]=Math.max(left,right);
25    }
26    public int longestCommonSubsequence(String s, String t) {
27        int m = s.length(), n = t.length();
28        int [][] dp = new int[m][n];
29        for(int i=0; i<m;i++){
30            for(int j=0; j<n;j++){
31                dp[i][j]=-1;
32            }
33        }
34        int ans = f(m-1, n-1, s, t,dp);
35        return ans;
36    }
37}