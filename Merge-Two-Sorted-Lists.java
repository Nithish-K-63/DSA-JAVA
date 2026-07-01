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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode tempA=list1;
14        ListNode tempB=list2;
15        ListNode dummy=new ListNode(-1);
16        ListNode temp=dummy;
17        while(tempA!=null && tempB!=null){
18            if(tempA.val<=tempB.val){
19                temp.next=tempA;
20                temp=temp.next;
21                tempA=tempA.next;
22            }else{
23                temp.next=tempB;
24                temp=temp.next;
25                tempB=tempB.next;
26            }
27        }
28        if(tempA!=null) temp.next=tempA;
29        if(tempB!=null) temp.next=tempB;
30        return dummy.next;
31    }
32}