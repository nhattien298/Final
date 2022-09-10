public class test {
    public static void main(String[] args) {
        int []a = {3,2,2,3};
        int []z = {0,1,2,4,5,2,6,7,8};
        RemoveElement_27 rm = new RemoveElement_27();
        int b = rm.removeElement(a, 3);

        System.out.println(b);
        for (int val:a
             ) {
            System.out.println(val+ " ");
        }


        System.out.println("----------> ");
        RemoveElement_27_c2 rm2 = new RemoveElement_27_c2();
        int v= rm2.removeElement2(a,3);
        System.out.println("cach 2 :  "+ v);
        int c = rm2.removeElement2(z, 2);
        System.out.println(c);
        for (int val:z
        ) {
            System.out.println(val+ " ");
        }

    }

}
