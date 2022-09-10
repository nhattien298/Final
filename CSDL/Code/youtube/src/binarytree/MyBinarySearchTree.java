package binarytree;



public class MyBinarySearchTree {
    TreeNode mRoot;

    public MyBinarySearchTree() {

    }
    //chen vao 1 node
    public TreeNode insert(TreeNode root, int data){
        TreeNode newNode = new TreeNode(data);
        //th1 root == null
        if(root == null){
            root = newNode;
            return root;
        }else{
            /// tao node temp de duyet cac node
            TreeNode temp = root;
            while(true){
                if(data > temp.getData()){
                    if(temp.getRightNode() == null){
                        temp.setRightNode(newNode);
                        break;
                    }else{
                        temp = temp.getRightNode();
                    }

                }else {
                    if(temp.getLeftNode()==null){
                        temp.setLeftNode(newNode);
                        break;
                    }else{
                        temp = temp.getLeftNode();
                    }

                }
            }
            return root;
        }
    }
}

