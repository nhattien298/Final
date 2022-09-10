

public class MyQueue<T> {
    private Node front;
    private Node tail;

    // constructor
    public MyQueue() {
    }
    public MyQueue(Node front, Node tail) {
        this.front = front;
        this.tail = tail;
    }

    //ham kiem tra xem queue co rong~ hay khong
    boolean isEmpty() {
        return (this.front == null);
    }

    //ham them node moi vao queue
    public void push(Product data) {
        Node newNode = new Node(data);
        newNode.setData(data);
        if (isEmpty()) {
            //cho front va tail deu chi ve newNode
            this.front = this.tail = newNode;
        } else {
            this.tail.setNextNode(newNode);
            //cap nhat node tail
            this.tail = newNode;
        }
    }

    //ham hien thi queue
    public void display(MyQueue<Product> queue) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node cur = queue.front;
            while (cur != null) {
                System.out.printf("%-15s | %-15s | %-15d | %-15.1f", cur.getData().getbCode(), cur.getData().getTitle(), cur.getData().getQuantity(), cur.getData().getPrice());
                System.out.println();
                cur = cur.getNextNode();
            }
        }
    }
}
