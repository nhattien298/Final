package lab3;

public class MyList {
    Node head, tail;

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

    }

    // Hàm thêm nhiều phần tử vào cuối danh sách
    public void addMany(int[] a) {
    }

    //Hàm hiển thị giá trị info của node p
    public void visit(Node p) {
        System.out.print(p.getInfo() + "  ");
    }

    // Hàm Duyệt danh sách
    public void traverse() {
        Node curentNode = head;
        while (curentNode != null){
            System.out.println(head.getInfo());
            curentNode = curentNode.getNext();
        }
    }

    // Hàm tìm kiếm phần tử có giá trị lớn hơn x, nếu tìm thấy thì hiển thị chỉ số của phần tử ra màn hình, giả sử phần tử đầu tiên có chỉ số là 0;
    public void Search(int x) {
    }
    public String toString() {
        String result = "{";
        Node curentNode = this.head;
        while(curentNode!= null){
            result+= curentNode.getInfo()+" ";
            curentNode = curentNode.getNext();
        }
        result+="}";
        return result;
    }


    public class Main {
        public static void main(String[] args) {
            MyList t = new MyList();
            int[] a = {7, 2, 9, 8, 6, 3};
            t.addMany(a);
            System.out.println("\n Traverse:");
            t.traverse();
            System.out.println("\n Search:");
            t.Search(8);
            System.out.println();
        }
    }
}
