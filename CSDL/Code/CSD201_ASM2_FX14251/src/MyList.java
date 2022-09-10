

import java.util.Scanner;

public class MyList<T> {
    public static Scanner sc = new Scanner(System.in);
    private Node head;
    private Node tail;
// constructor
    public MyList() {
    }
    public MyList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    //ham tra ve node head
    public Node getHead() {
        return head;
    }

    //ham them vao cuoi list
    public void addTail(Product data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    //ham xoa node cuoi list
    public void delHead(MyList<Product> list) {
        if (list.head == null) {
            System.out.println("The list is empty");
        } else {
            list.head = list.head.getNextNode();//cap nhat node head sang node ke tiep
        }
    }

    //ham xoa node theo Bar code
    public void delNodeByBcode(MyList<Product> list, String bCode) {
        if (list.head.getData().getbCode().equalsIgnoreCase(bCode)) {
            delHead(list);
        } else {
            Node cur = list.head;
            //so sanh bar code cua node cur voi bar code node can xoa
            while (cur.getNextNode().getNextNode() != null && cur.getNextNode().getData().getbCode().equalsIgnoreCase(bCode) == false) {
                cur = cur.getNextNode();
            }
            if (cur.getNextNode().getData().getbCode().equalsIgnoreCase(bCode) == false) {
                System.out.println("The bar code is not available");
            } else {
                cur.setNextNode(cur.getNextNode().getNextNode());
            }
        }
    }

    //ham sap xep bang buble sort
    public void SortList(MyList<Product> list) {
        Node curentNode = this.head; // tao node de so sanh
       while(curentNode != null){
           Node currentNextNode = curentNode.getNextNode(); // tao node thu 2 de so sanh voi node thu nhat
           while(currentNextNode !=null){
               if(curentNode.getData().getbCode().compareToIgnoreCase(currentNextNode.getData().getbCode())>0){
                   Product temp = curentNode.getData(); // swap 2 gia tri neu nhu co su lon hon cua node truoc vs node sau
                   curentNode.setData(currentNextNode.getData());
                   currentNextNode.setData(temp);
               }
               currentNextNode = currentNextNode.getNextNode();// gan node ke tiep de tiep tuc so sanh
           }
           curentNode = curentNode.getNextNode();// gan node ke tiep
       }


    }


    //ham hien thi list
    public void display(MyList<Product> list) {
        Node current = this.getHead();
        while (current != null) {
            System.out.printf("%-15s | %-15s | %-15d | %-15.1f", current.getData().getbCode(), current.getData().getTitle(), current.getData().getQuantity(), current.getData().getPrice());
            System.out.println();
            current = current.getNextNode();
        }
    }

}
