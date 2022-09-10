public class DoublyEndList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }
        if(this.tail != null){
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }
    public String toString(){
        String result = "{";
        Node currentNode = this.head;
        while(currentNode != null){
        result += currentNode + " ,";
        currentNode = currentNode.getNextNode();
        }
        result +="}";
        return result;
    }
}
