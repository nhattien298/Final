package lab3;

public class MyList {
    public Node head, tail;

    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = tail = null;
    }
    // ham  them 1 phan tu vao cuoi danh sach

    public void addTail(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    // ham them nhieu phan tu vao cuoi danh sach
    public void addMany(int[] a) {
        for (int i = 0; i < a.length; i++) {
            addTail(a[i]);
        }


    }

    public void visit(Node node) {
        System.out.println(node.getInfo() + " ");
    }

    public void traverse() {
        Node currentNode = this.head;
        while (currentNode != null) {
            visit(currentNode);
            currentNode = currentNode.getNextNode();
        }
    }

    public void search(int x) {
        int count = 0;
        Node currentNode = this.head;
        boolean isfound = false;
        while (currentNode != null) {
            count++;
            if (currentNode.getInfo() == x) {
                System.out.print(" " + count);
                isfound = true;
            }
            currentNode = currentNode.getNextNode();
        }
        if (!isfound) {
            System.out.println("not found!!!");
        }


    }

}
