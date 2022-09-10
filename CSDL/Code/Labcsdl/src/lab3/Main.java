package lab3;

public class Main {
    public static void main(String[] args) {
        {MyList t = new MyList();
            int [] a = {7,2,9,8,6,3};
//            t.addTail(1);
//            t.addTail(2);
//            t.traverse();
            t.addMany(a);
            System.out.println("\n Traverse:");
            t.traverse();
            System.out.println("\n Search:");
            t.search(10);
            System.out.println();
        }
    }

}
