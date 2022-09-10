package stack;

import java.util.EmptyStackException;

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

    public class LinkedStack{
        protected Node head;
        public LinkedStack(){
            head = null;
        }
        public boolean isEmpty(){
            return (head == null);
        }
        public void push(Object x){
            head = new Node(x, head);

        }
        public Object top() throws EmptyStackException{
            if(isEmpty()) throw new EmptyStackException();
            return (head.info);
        }
        public Object pop()throws EmptyStackException{
            if(isEmpty()) throw new EmptyStackException();
            Object x = head.info;
            head = head.next;
            return x;
        }
    }

}
