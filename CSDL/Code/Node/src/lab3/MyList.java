package lab3;

public class MyList {
    private Node head, tail;

    // Xây dựng lớp Mylist của danh sách liên kết
    public MyList() {
        head = tail = null;

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = tail = null;
    }

    // Hàm thêm  một phần tử vào cuối danh sách
    public void addTail(int x) {
        Node newNode = new Node(x);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.setNextNode(newNode);
        }
        this.tail = newNode;
    }

    // Hàm thêm nhiều phần tử vào cuối danh sách
    public MyList addMany(int[] a) {
        MyList newList = new MyList();
        for (int val : a) {
            newList.addTail(val);
        }
        return newList;
    }

    //Hàm hiển thị giá trị info của node p
    public void visit(Node p) {
        Node currentNode = this.head;
        if (currentNode == null) {
            System.out.println("the list is empty");
        }
        while (currentNode != null) {
            if (currentNode.getInfo() == p.getInfo()) {
                System.out.println("info : " + currentNode.getInfo());
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        System.out.println("không tìm thấy giá trị ");

    }

    public void visit2(Node p) {
        System.out.println("info : " + p.getInfo());
    }

    // Hàm Duyệt danh sách
    public void traverse() {
        int count = 0;
        Node current = this.head;
        if(isEmpty()){
            System.out.println("this list is empty");
        }
        while(current != null){
            System.out.println("Node "+ count+ ": "+ current.getInfo());
            count++;
            current = current.getNextNode();
        }

    }
    // ham tim kiem
    public int search(int x){
        Node currentNode = this.head;
        int count = 0;
        if(currentNode == null){
            return -1;
        }
        while(currentNode!= null){

            if(currentNode.getInfo() > x){
                return count;

            }
            count++;
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }

    public int length() {
        int length = 0;
        Node current = this.head;
        if (current == null) {
            return 0;
        }
        while (current !=null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }


    public String toString() {
        Node currentNode = this.head;
        String result = "{";
        while (currentNode != null) {
            result += currentNode.toString() + " ,";
            currentNode = currentNode.getNextNode();
        }
        result += "}";
        return result;
    }

}
