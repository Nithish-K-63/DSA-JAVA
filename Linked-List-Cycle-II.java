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
13    public ListNode detectCycle(ListNode head) {
14        ListNode fast=head;
15        ListNode slow=head;
16        while(fast!=null&&fast.next!=null){
17            fast=fast.next.next;
18            slow=slow.next;
19            if(slow==fast){
20                fast=head;
21                while(fast!=slow){
22                    fast=fast.next;
23                    slow=slow.next;
24                }
25                return fast;
26            }
27        }
28        return null;
29    }
30}