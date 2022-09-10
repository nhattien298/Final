package lab4;

public class Main {
    public static void main(String[] args) {
//        MyList list = new MyList();
//        Person p1 = new Person("tien", 28);
//        Person p2 = new Person("lam", 20);
//        Person p3 = new Person("mai", 13);
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        System.out.println(list);
        String[] a = {"HOA", "HA", "LAN", "NOI", "MUA", "NAY"};
        int[] b = {25, 17, 26, 19, 23, 21};
        MyList t = new MyList();
        t= t.addMany(a, b);
//        System.out.println(t);

        t.traverse();
        t.sortByName();

        System.out.println("=========> ");
        t.traverse();
    }
}
