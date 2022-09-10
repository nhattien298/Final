package stack;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;


    public Stack( int max){
        maxSize = max;
        stackArray = new char[ maxSize ];
        top =-1;
    }
    public void push(char j){
        if(top >= maxSize -1){
            System.out.println("StackoverFlow");
            return;
        }
        stackArray[++top]= j;
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("IndexOutOfBound");
            return 0;
        }
        return stackArray[top--];
    }
    public char peek(){
        return stackArray[top];

    }

    public boolean isEmpty(){
        return (top == -1);}
}
