package lab3;

public class TestNode {
    public static void main(String[] args) {
        MyList ml = new MyList();
//        ml.addTail(3);
//        ml.addTail(5);
//        System.out.println(ml);
        int[]a = {7,2,9,8,6,3};
       ml =  ml.addMany(a);
        System.out.println(ml);
        System.out.println("++++++++>");

        Node p = new Node(5);
        ml.visit(p);

        System.out.println("------->>>>>>");
        ml.visit2(p);

        System.out.println(" duyet danh sach ");
        ml.traverse();

        System.out.println("search x --------> ");
        int n = ml.search(8);
        System.out.println(n);
    }
}
