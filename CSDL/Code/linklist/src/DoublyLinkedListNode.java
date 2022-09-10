public class DoublyLinkedListNode {
    private int data;
    private DoublyLinkedListNode nextNode;
    private DoublyLinkedListNode prevNode;

    public DoublyLinkedListNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedListNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyLinkedListNode prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "{" +
                "data = " + this.data +
                '}';
    }
}
