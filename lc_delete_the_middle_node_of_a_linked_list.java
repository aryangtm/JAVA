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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)return null;
        int co = 0;
        ListNode c;
        for(c = head;c!=null;c=c.next){
            co++;
        }
        c=head;
        for(int i = 0;i<(co/2)-1;i++){
            c=c.next;
        }
        if(c.next!=null)
        c.next=c.next.next;
        return head;
    }
}
