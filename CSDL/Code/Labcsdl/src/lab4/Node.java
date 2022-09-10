package lab4;

public class Node {
    private  Person info;
    private Node nexNode;
    public Node(Person x, Node p){
        this.info = x;
        this.nexNode = p;
    }
    public Node(Person x){
        this(x, null);
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public Node getNexNode() {
        return nexNode;
    }

    public void setNexNode(Node nexNode) {
        this.nexNode = nexNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "info=" + info +
                ", nexNode=" + nexNode +
                '}';
    }
    public int GiaiThua(int n)
    {
        // trả về kết quả của n! = 1*2*3*...*n, quy ước 0! = 1 bằng đệ quy
        if(n==0){
            return 1;
        }
        return n*GiaiThua(n-1);

    }

}
