package lab3;

public class Node {
    private int info;
    private Node nextNode;
    //constructor
    public Node(){}
    public Node(int x, Node p){
        this.info = x;
        this.nextNode = p;
    }
    public Node(int x){
        this(x,null);
    }
    //getter and setter
    public void setInfo(int x){
        this.info = x;
    }
    public int getInfo(){
        return this.info;
    }
    public void setNextNode(Node p){
        this.nextNode = p;
    }
    public Node getNextNode(){
        return this.nextNode;
    }
    public String toString(){
        return "info : "+ this.info;
    }
}
