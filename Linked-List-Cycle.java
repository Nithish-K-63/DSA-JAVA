1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode temp=head;
15        HashMap<ListNode,Boolean> mp=new HashMap<>();
16        while(temp!=null){
17            if(mp.containsKey(temp)){
18                return true;
19            }
20            mp.put(temp,true);
21            temp=temp.next;
22        }
23        return false;
24    }
25}//TC:O(N)
26//SC:O(N)