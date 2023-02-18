class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Insert_at_begin_singlyLL {
    public static void main(String[] args) {
        Node head =null;
        head=insAtBegin(head, 30);
        head=insAtBegin(head, 20);
        head=insAtBegin(head, 10);
        print(head);
    }
    public static Node insAtBegin(Node head,int data) {
        Node n = new Node(data);
        n.next=head;
        return n;
    }
    public static void print(Node head) {
        Node c = head;
        while(c!=null){
            System.out.println(c.data);
            c=c.next;
        }
    }
}
