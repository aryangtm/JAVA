class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class Delete_last_node_of_singlyLL {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node t1 = new Node(10);
        Node t2 = new Node(20);
        Node t3 = new Node(30);
        head.next=t1;
        t1.next=t2;
        t2.next=t3;
        head = delFirst(head);
        print(head);
    }
    public static void print(Node head) {
        Node c = head;
        System.out.println("Linked List After Deletion Operation");
        while(c!=null){
            System.out.print(c.data+" ");
            c=c.next;
        }
    }
    public static Node delFirst(Node head) {
        if(head==null||head.next==null){
            return null;
        }
        Node c = head;
        while(c.next.next!=null){
            c=c.next;
        }
        c.next=null;
        return head;
    }
}
