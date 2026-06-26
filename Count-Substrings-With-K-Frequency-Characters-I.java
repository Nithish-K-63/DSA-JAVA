1class Solution {
2    long f(String s, int k) {
3        int n = s.length();
4        int l = 0;
5        long cnt = 0;
6        int[] freq = new int[26];
7        for (int r = 0; r < n; r++) {
8            int idx = s.charAt(r) - 'a';
9            freq[idx]++;
10            while (freq[idx] >= k) {
11                freq[s.charAt(l) - 'a']--;
12                l++;
13            }
14            cnt += (r - l + 1);
15        }
16        return cnt;   // substrings where all frequencies < k
17    }
18    public int numberOfSubstrings(String s, int k) {
19        int n = s.length();
20        long total = (long) n * (n + 1) / 2;
21        return (int)(total - f(s, k));
22    }
23}