// Lớp Node chứa thông tin và hoạt động của mỗi node

class Node
 {int info;
  Node next;
  Node() {}
  Node(int x, Node p) {info=x;next=p;}
  Node(int x) {this(x,null);}
 }

// Xây dựng lớp Mylist của danh sách liên kết
class MyList
 {Node head, tail;
  MyList() {head=tail=null;}
  boolean isEmpty() {return(head==null);}
  void clear() {head=tail=null;}
//Hàm thêm  một phần tử vào cuối danh sách
 void addTail(int x)
 {}

//Hàm thêm nhiều phần tử vào cuối danh sách
 void addMany(int [] a)
  {
  }
//Hàm hiển thị giá trị info của node p
 void visit(Node p)
  {System.out.print(p.info + "  ");
  }

//Hàm Duyệt danh sách
 void traverse() 
  {
  }

//Hàm tìm kiếm phần tử có giá trị lớn hơn x, nếu tìm thấy thì hiển thị chỉ số của phần tử ra màn hình, giả sử phần tử đầu tiên có chỉ số là 0;
 void Search(int x)
  {
}
public class Main
{public static void main(String [] args)
  {MyList t = new MyList();
   int [] a = {7,2,9,8,6,3};
   t.addMany(a);
   System.out.println("\n Traverse:");  
   t.traverse();
   System.out.println("\n Search:"); 
    t.Search(8);
   System.out.println(); 
  }
}
  
 } 
