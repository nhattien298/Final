package lab4;

public class Node {
    private Person info;
    private Node nextNode;
    public Node(Person x, Node p){
        this.info = x;
        this.nextNode = p;
    }
    public Node(Person x){
        this.info = x;
        this.nextNode = null;
//        this(x,null); thay the hoi quy lai cai node o tren.
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return   info.toString();
    }
}
