public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.insertAtHead(2);
        list.insertAtHead(1);

        System.out.println(list);
        System.out.println("length of the list is : "+ list.length());
        list.deleteFromHead();
        System.out.println("----------");
        System.out.println(list);
        System.out.println("length of the list is : "+ list.length());

        System.out.println("found : "+ list.search(10));
        System.out.println("found : "+ list.search(6));


        System.out.println("=========> double end list");
        DoublyLinkList dl = new DoublyLinkList();
        dl.insertAtTail(4);
        dl.insertAtTail(5);
        dl.insertAtTail(6);
        dl.insertAtTail(7);
        dl.insertAtTail(9);
        dl.insertAtTail(8);
        System.out.println(dl);


    }
}
