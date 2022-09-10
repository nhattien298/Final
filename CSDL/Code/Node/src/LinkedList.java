public class LinkedList {
    Node head;

    public Node search(int data){
        Node currentNode = this.head;
        while(currentNode != null){
            if(currentNode.getData() == data){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }
    public void insertAtHead(int data){
        Node newHead = new Node(data);
        newHead.setNextNode(this.head);
        this.head = newHead;
    }
    public void deleteFromHead(){
        this.head=this.head.getNextNode();
    }
    public String toString(){
        String result ="{";
        Node currentNode = this.head;
        while(currentNode!=null){
            result += currentNode.toString()+ ",";
            currentNode = currentNode.getNextNode();
        }
        result+="}";
        return result;
    }
    public int length(){
        int length = 0;
        Node currentNode = this.head;
        if(currentNode == null){
            return 0;

        }
        while(currentNode!=null){
              length++;
              currentNode = currentNode.getNextNode();
        }
        return length;


    }

}
