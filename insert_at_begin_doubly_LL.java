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
public class insert_at_begin_doublyLL {
    public static void main(String[] args) {
        Node head = null;
        head = iAb(head, 30);
        head= iAb(head, 20);
        head= iAb(head, 10);
        p(head);
    }
    public static Node iAb(Node head,int data) {
        Node n = new Node(data);
        n.next=head;
        if(head!=null){
            head.prev=n;
        }
        return n;
    }
    public static void p(Node head) {
        Node c = head;
        while(c!=null){
            System.out.println(c.data);
            c=c.next;
        }        
    }
}
