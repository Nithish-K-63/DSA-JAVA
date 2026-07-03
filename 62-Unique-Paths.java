// recression
//class Solution {
//     int f(int i, int j){
//         if(i<0 || j<0) return 0;
//         if(i==0 && j==0) return 1;
//         int up = f(i-1, j);
//         int left = f(i, j-1);
//         return up+left;
//     } 
//     public int uniquePaths(int m, int n) {
//         int ans = f(m-1,n-1);
//         return ans;
//     } 
// }
//memorization
//class Solution {
//     int f(int i, int j, int [][] dp){
//         if(i<0 || j<0) return 0;
//         if(i==0 && j==0) return 1;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int up = f(i-1, j, dp);
//         int left = f(i, j-1, dp);
//         return dp[i][j]=up+left;
//     } //memorization
//     public int uniquePaths(int m, int n) {
//         int [][] dp = new int[m][n];
//         for(int [] row : dp) Arrays.fill(row, -1);
//         int ans = f(m-1,n-1,dp);
//         return ans;
//     } 
// }
//tabulation
class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for(int [] row : dp) Arrays.fill(row, 1);
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        int ans = dp[m-1][n-1];
        return ans;
    } 
}