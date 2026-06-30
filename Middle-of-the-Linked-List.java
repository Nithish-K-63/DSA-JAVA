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
11// class Solution {
12//     public ListNode middleNode(ListNode head) {
13//         int n=0;
14//         ListNode temp=head;
15//         while(temp!=null){
16//             temp=temp.next;
17//             n++;
18//         }
19//         int middle=n/2;
20//         temp=head;
21//         for(int i=0;i<middle;i++){
22//             temp=temp.next;
23//         }return temp;
24//     }
25// }//TC:O(N)
26// OPTIMIZTION:
27class Solution {
28    public ListNode middleNode(ListNode head) {
29        ListNode fast=head;
30        ListNode slow=head;
31        while(fast!=null&& fast.next!=null){
32            slow=slow.next;
33            fast=fast.next.next;
34        }
35        return slow;
36    }
37}