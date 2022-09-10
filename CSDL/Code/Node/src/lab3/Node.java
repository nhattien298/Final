package lab3;

public class Node {
    private  int info;
    private Node nextNode;
    public Node(int x, Node p){
        this.info = x;
        this.nextNode =p;
    }
    public Node(int x){
        this.setInfo(x);
        this.nextNode = null;
    }
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nexNode) {
        this.nextNode = nexNode;
    }
    public String toString(){
        return "info : "+ this.getInfo();
    }
}
