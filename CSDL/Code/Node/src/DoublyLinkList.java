public class DoublyLinkList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;

        }else{
            this.tail.setNextNode( newNode);
        }
        this.tail = newNode;


    }
    public String toString(){
        String result ="{";
        Node currentNode = this.head;
        while(currentNode != null){
            result += currentNode.toString() + " ,";
            currentNode = currentNode.getNextNode();
        }
        result+="}";
        return result;
    }

}
