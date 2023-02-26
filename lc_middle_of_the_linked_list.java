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
    public ListNode middleNode(ListNode head) {
        if(head==null)return null;
        int co = 0;
        ListNode c;
        for(c = head;c!=null;c=c.next){
            co++;
        }
        c=head;
        for(int i = 0;i<(co/2);i++){
            c=c.next;
        }
        return c;
    }
}
