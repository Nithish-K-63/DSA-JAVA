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
12
13    // Reverse a linked list
14    ListNode reverse(ListNode head) {
15        ListNode curr = head;
16        ListNode prev = null;
17
18        while (curr != null) {
19            ListNode temp = curr.next;
20            curr.next = prev;
21            prev = curr;
22            curr = temp;
23        }
24
25        return prev;
26    }
27
28    public boolean isPalindrome(ListNode head) {
29
30        if (head == null || head.next == null)
31            return true;
32
33        // Find middle
34        ListNode slow = head;
35        ListNode fast = head;
36
37        while (fast.next != null && fast.next.next != null) {
38            slow = slow.next;
39            fast = fast.next.next;
40        }
41
42        // Second half
43        ListNode head2 = slow.next;
44        slow.next = null;
45
46        // Reverse second half
47        ListNode reversedHead = reverse(head2);
48
49        // Compare
50        ListNode l = head;
51        ListNode h = reversedHead;
52
53        while (h != null) {
54            if (l.val != h.val)
55                return false;
56
57            l = l.next;
58            h = h.next;
59        }
60
61        return true;
62    }
63}