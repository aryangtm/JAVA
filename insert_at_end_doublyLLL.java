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
public class inser_at_last_doublyLL {
    public static void main(String[] args) {
        Node head =null;
        head = iAl(head, 0);
        head= iAl(head, 1);
        head= iAl(head, 2);
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
    public static void p(Node head) {
        Node c = head;
        while(c!=null){
            System.out.println(c.data);
            c=c.next;
        }        
    }
}
