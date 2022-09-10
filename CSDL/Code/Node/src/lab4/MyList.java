package lab4;

public class MyList {
    Node head, tail;

    public MyList() {
        head = tail = null;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    //ham them mot nguoi vao danh sach lien ket.
    public void add(Person x) {
        Node newNode = new Node(x);
        if (this.head != null) {
            newNode.setNextNode(this.head);
        }
        this.head = newNode;

    }

    // add them nhiều người vào danh sách
    public MyList addMany(String[] a, int[] b) {
        MyList newList = new MyList();
        for (int i = 0; i < a.length; i++) {
            Person p = new Person(a[i], b[i]);
            newList.add(p);
        }
        return newList;
    }

    public void traverse() {
        Node currentNode = this.head;
        if (this.head == null) {
            System.out.println("this list is empty!");
        }
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNextNode();
        }
    }

    // sap xep theo ten
    public void sortByName() {
        Node curNode = this.head;
        if (curNode == null) {
            return;
        }
        while (curNode != null) {
            Node curNext = curNode.getNextNode();
            while (curNext != null) {
                System.out.println("ten cua currentnode : " + curNode.getInfo().getName());
                System.out.println("ten cua nextnode : " + curNext.getInfo().getName());
                System.out.println(" ---------->");
                System.out.println("ketqua :" + curNode.getInfo().getName().compareToIgnoreCase(curNext.getInfo().getName()));
                if ((curNode.getInfo().getName().compareToIgnoreCase(curNext.getInfo().getName())) > 0) {
                    Person temp = curNode.getInfo();
                    curNode.setInfo(curNext.getInfo());
                    curNext.setInfo(temp);
                    System.out.println("swap roi nha 2");
                    Node inNode = this.head;
                    while(inNode != null){
                        System.out.println(inNode);
                        inNode = inNode.getNextNode();
                    }
                }
                curNext = curNext.getNextNode();
            }
            curNode = curNode.getNextNode();
            System.out.println("co chay o day ko ?????????????");
        }
    }
    // ham xac dinh do dai cua list
    public int length() {
        int length = 0;
        Node curNode = this.head;
        if (curNode == null) {
            return 0;
        }
        while (curNode != null) {
            length++;
            curNode = curNode.getNextNode();
        }
        return length;
    }
    public String toString() {
        String result = "{";
        Node currentNode = this.head;
        if (isEmpty()) {
            return null;
        }
        while (currentNode != null) {
            result += currentNode.toString() + ",";
            currentNode = currentNode.getNextNode();
        }
        result += "}";
        return result;
    }


}
