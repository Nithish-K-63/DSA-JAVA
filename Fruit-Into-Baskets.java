1import java.util.HashMap;
2class Solution {
3    public int totalFruit(int[] fruits) {
4        int n = fruits.length;
5        int l = 0, max = 0;
6        HashMap<Integer, Integer> mp = new HashMap<>();
7        for (int r = 0; r < n; r++) {
8            mp.put(fruits[r], mp.getOrDefault(fruits[r], 0) + 1);
9            while (mp.size() > 2) {
10                mp.put(fruits[l], mp.get(fruits[l]) - 1);
11                if (mp.get(fruits[l]) == 0) {
12                    mp.remove(fruits[l]);
13                }
14                l++;
15            }
16           max = Math.max(max, r - l + 1);
17        }
18        return max;
19    }
20}