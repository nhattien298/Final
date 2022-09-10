import com.sun.source.tree.Tree;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.mRoot =bt.insertUseCursion(bt.mRoot,5);
        bt.mRoot =bt.insertUseCursion(bt.mRoot,1);
        bt.mRoot =bt.insertUseCursion(bt.mRoot,6);
        bt.mRoot =bt.insertUseCursion(bt.mRoot,0);
        bt.mRoot =bt.insertUseCursion(bt.mRoot,3);
        bt.mRoot =bt.insertUseCursion(bt.mRoot,7);
        bt.mRoot =bt.insertUseCursion(bt.mRoot,2);
        bt.mRoot =bt.insertUseCursion(bt.mRoot,4);

        // xoa key
//        bt.deleteNode(bt.mRoot,1); bi loi chua xac dinh duoc
//        TreeNode a = bt.searchBst(bt.mRoot,10);
//        System.out.println(a);

        bt.inOder(bt.mRoot);
        bt.postOder(bt.mRoot);
        System.out.println("done");


    }

}
