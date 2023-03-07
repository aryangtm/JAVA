/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
 if (head == null) {
        return null;
    }

    int len = 0;
    for (ListNode c = head; c != null; c = c.next) {
        len++;
    }

    if (n ==len) {
        return head.next;
    }

    ListNode cu = head;
    for (int i = 0; i < len-n-1; i++) {
        cu = cu.next;
    }
    cu.next = cu.next.next;
    return head;
    }
}
