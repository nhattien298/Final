public class LinkedList {
    private Node head;
    public void insertAtHead(int data ){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }
    public int length() {
        int length =0;
        Node current = this.head;

        while(current != null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }
    public void deleteFormHead(){
        this.head = this.head.getNextNode();
    }
    public Node find(int data){
        Node current = this.head;
        while(current != null){
            if(current.getData()== data){
                return current;
            }
            current = current.getNextNode();

        }
        return null;
    }

    public String toString() {
        String result = "{";
        Node currentNode = this.head;
        while(currentNode != null){
            result += currentNode.toString() + ",";
            currentNode = currentNode.getNextNode();
        }
        result +="}";
        return result;
    }
}
