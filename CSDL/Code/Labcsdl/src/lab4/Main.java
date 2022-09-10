package lab4;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        String[] a = {"HOA", "HA", "LAN", "NOI", "MUA", "NAY"};
        int[] b = {25, 17, 26, 19, 23, 21};
        MyList t = new MyList();
        t.addMany(a, b);
        t.traverse();
        System.out.println(" ===========");
        t.sortByName();
        t.traverse();
        System.out.println(" ===========");
        t.sortByAge();
        t.traverse();

    }
}
