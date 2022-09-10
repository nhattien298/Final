public class List {
    private Node head, tail;

    public void insert(int data){
        head = new Node(data, head);
        if(tail == null){
            tail = head;
        }
    }
}
