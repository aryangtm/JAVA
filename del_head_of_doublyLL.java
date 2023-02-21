class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data=x;
        next=null;
        prev=null;
    }
}
public class delete_head_doublyLL {
    public static void main(String[] args) {
        Node head =null;
        head = iAl(head, 0);
        head= iAl(head, 1);
        head= iAl(head, 2);
        head=delHead(head);
        p(head);
    }
    public static Node iAl(Node head,int data) {
        Node n = new Node(data);
        if(head==null){
             return n;
        }
        Node c = head;
        while(c.next!=null)
            c=c.next;
        c.next=n;
        n.prev=c.next;
        return head;
    }
    public static Node delHead(Node head) {
        if(head==null)return null;
        if(head.next==null)return null;
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }
    public static void p(Node head) {
        Node c = head;
        while(c!=null){
            System.out.println(c.data);
            c=c.next;
        }        
    }
}
