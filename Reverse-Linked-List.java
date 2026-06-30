1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        ListNode curr=head,t;
14        ListNode pre=null;
15        while(curr!=null){
16            t=curr.next;
17            curr.next=pre;
18            pre=curr;
19            curr=t;
20        }
21        return pre;
22    }
23}