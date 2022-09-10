package lab5;

import java.util.EmptyStackException;

public class MyStack {
    private Node head;
    public MyStack() {head = null;}
    public boolean isEmpty() {return (head == null);}

    // ham them 1 phan tu vao stack
    public void push (int x){
        head = new Node(x, head);
    }
    // ham lay 1 phan tu ra khoi stack
    public int pop()throws EmptyStackException{
        int x= 0;
        if(isEmpty() ){
            throw new EmptyStackException();

        }else{
            x= head.getInfo();
            head = head.getNext();
        }
        return x;
    }
    public void  ConvertToBinary(int x){
        MyStack mt = new MyStack();
        System.out.print(x + " qui ra hệ nhị phân là : ");
        while(x>0){
            mt.push(x%2);
           x= x/2;
        }
        while(!mt.isEmpty()){
            System.out.print(mt.pop() + " ");
        }
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while(current!=null){
            result+= current.toString()+ ",";
            current = current.getNext();
        }
        result +="}";
        return result;
    }

}
