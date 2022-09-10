package binarytree;

public class Test {
    public static void main(String[] args) {
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        mbst.mRoot = mbst.insert(mbst.mRoot,5);
        mbst.mRoot = mbst.insert(mbst.mRoot,1);
        mbst.mRoot = mbst.insert(mbst.mRoot,6);
        mbst.mRoot = mbst.insert(mbst.mRoot,0);
        mbst.mRoot = mbst.insert(mbst.mRoot,3);
        mbst.mRoot = mbst.insert(mbst.mRoot,7);
        mbst.mRoot = mbst.insert(mbst.mRoot,2);
        mbst.mRoot = mbst.insert(mbst.mRoot,4);
        System.out.println("done");
    }
}
