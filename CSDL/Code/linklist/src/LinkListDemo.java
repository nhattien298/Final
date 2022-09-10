public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);
        list.insertAtHead(30);
//        list.deleteFormHead();
//        System.out.println(list);
//        System.out.println(list.length());
        System.out.println("find : "+ list.find(40));
    }
}
