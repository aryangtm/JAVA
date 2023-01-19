class Solution {
    public int getDecimalValue(ListNode head) {
    int si =0;
    while(head != null){
        si = si*2+head.val;
        head=head.next;
    }
    return si;
    }
}
