package btap;

public class ListNode {
    int value;
    ListNode nextNode;
    ListNode(){
    }
    ListNode(int value){this.value = value;}
    ListNode(int value, ListNode next){
        this.value = value;
        this.nextNode = next;
    }
    public static ListNode reverseList(ListNode head){
        ListNode currentNode = head;
        while(currentNode !=null && currentNode.nextNode != null ){
            ListNode next = currentNode.nextNode;
            currentNode.nextNode = next.nextNode;
            next.nextNode = head;
            head = next;
        }
        return head;
    }
    public static void printLinkList(ListNode head){
        while(head != null){
            System.out.print("data : "+ head.value+ " ");
            head = head.nextNode;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a1= new ListNode(1);
        ListNode a2= new ListNode(2);
        ListNode a3= new ListNode(3);
        a1.nextNode = a2;
        a2.nextNode = a3;
        printLinkList(a1);
        ListNode newlist = reverseList(a1);
        printLinkList(newlist);


    }
}