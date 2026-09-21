class Solution {
    public int reverseDegree(String s) {
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            int n = -(s.charAt(i) - 'z' - 1);
            ans += n * (i + 1);
        }

        return ans;
    }
}