public class Node {
// tao Node
    private Product data;
    private Node nextNode;
//constructor
    public Node() {
    }

    public Node(Product data) {
        this.data = data;
    }
//getter va setter
    public Product getData() {
        return data;
    }

    public void setData(Product data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
// tostring
    public String toString() {
        return getData().getbCode() + " " + getData().getTitle() + " " + getData().getQuantity() + " " + getData().getPrice();
    }
// ham hien thi ra man hinh
    public void displayNode(Node data) {
        System.out.printf("%-15s | %-15s | %-15d | %-15.1f", getData().getbCode(), getData().getTitle(), getData().getQuantity(), getData().getPrice());
    }
}

