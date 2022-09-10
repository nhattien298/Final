package queue;

public class Node {
    public Object info;
    public Node next;
    public Node(Object x, Node p){
        info = x;
        next = p;
    }
    public Node(Object x){
        this(x, null);
    }
    public class MyQueue{
        protected Node head, tail;
        public MyQueue(){
            head = tail = null;
        }
        public boolean isEmpty() {
            return(head == null);
        }
        Object front()throws Exception{
            if(isEmpty()) throw new Exception();
            return head.info;

        }
        public Object deQueue()throws Exception {
            if(isEmpty()){
                throw new Exception();
            }
            Object x = head.info;
            head = head.next;
            if(head == null){tail = null;}
            return x;
        }
        public void enQueue(Object x){
            Node newNode = new Node(x);
            if(isEmpty()){
                head = tail = newNode;

            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
    }
}
