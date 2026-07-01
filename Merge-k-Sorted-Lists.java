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
12    public ListNode mergeKLists(ListNode[] lists) {
13        ListNode dummy = new ListNode(-1);
14        ListNode temp = dummy;
15        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->{
16            return a.val - b.val;
17        });
18        for(int i=0; i<lists.length; i++){ //O(N)
19            ListNode head = lists[i];
20            if(head!=null) q.add(head); //log(N)
21        } //O(nlog(n))
22        while(q.size()>0){ //O(number of nodes)
23            ListNode curr = q.poll();
24            temp.next = curr;
25            temp = temp.next;
26            if(curr.next!=null) q.add(curr.next);
27        }
28        return dummy.next;
29    }
30}
31