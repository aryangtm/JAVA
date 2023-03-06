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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }   
        ListNode l1=head;
        ListNode tail=head;
        while(l1!=null&&l1.next!=null){
            if(l1.val!=l1.next.val){
                tail.next=l1.next;
                tail=tail.next;
            }
            l1=l1.next;
        }
        tail.next=null;
        return head;
    }
}
