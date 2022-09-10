public class DoublyLinkedList {
    private DoublyLinkedListNode head;
    public void insertAtHead(int data){
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        newNode.setNextNode(this.head);
        if(this.head != null){
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;
    }
    public int length(){
        if(head == null){
            return 0;
        }
        int length =0;
        DoublyLinkedListNode currentNode = this.head;
        while(currentNode != null){
            length++;
            currentNode = currentNode.getNextNode();
        }
        return length;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        DoublyLinkedListNode n = this.head;
        while (n != null){
            sb.append("Node data : ");
            sb.append(n);
            sb.append("\n");
            n = n.getNextNode();
        }
        return sb.toString();
    }
}
