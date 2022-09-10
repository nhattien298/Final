package heap;

public class MyHeap {
    private static int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE+1];
    private int size;
    MyHeap() {
        size = 0;
    }
    // kiem tra rong
    public boolean isEmpty() {
        return (size ==0);
    }
    // ham lay phan tu root
    public int peek() {
      if(isEmpty()){
          //throw Exception
          System.out.println("Heap is empty");
          return -1;
      }
      return arr[1];

    }
    //  them phan tu vao heap
    public void add(int v){
        size++;
        arr[size]= v;
        //heapifyUp
        int currentIndex = size;
        int parentIndex = size/2;
        while(arr[parentIndex]> arr[currentIndex]){ // cha lon hon con
            //doi cho
            int temp = arr[parentIndex];
            arr[parentIndex]= arr[currentIndex];
            arr[currentIndex]= temp;
        }
    }


}
