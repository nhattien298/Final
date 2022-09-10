package lab3;

public class Node {

    private int info;
    private Node next;

    public Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node() {
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
