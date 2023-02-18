class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Delete_first_node_of_singlyLL {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node t1 = new Node(10);
        Node t2 = new Node(20);
        head.next=t1;
        t1.next=t2;
        head = delFirst(head);
        print(head);
    }
    public static void print(Node head) {
        Node c = head;
        System.out.println("Linked List After Deletion Operation");
        while(c!=null){
            System.out.print(c.data+" ");
            c=c.next;a
        }
    }
    public static Node delFirst(Node head) {
        if(head==null){
            return null;
        }
        else{
            head=head.next;
            return head;
        }
    }
}
