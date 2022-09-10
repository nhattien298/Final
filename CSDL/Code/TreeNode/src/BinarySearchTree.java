public class BinarySearchTree {
    public TreeNode mRoot;

    //duyet cay theo kieu preOder
    public void preOder(TreeNode currentRoot){ // N - L - R
        if(currentRoot == null){
            return;
        }else{
            System.out.print(currentRoot.getValue()+ " " );// duyet currentNode
            preOder(currentRoot.getLeft());// ben trai
            preOder(currentRoot.getRight());//ben phai
        }
    }
    // duyet cay theo kieu inOder
    public void inOder(TreeNode root){ // L - N - R
        if(root == null){
            return;
        }else{
            inOder(root.getLeft());
            System.out.print(root.getValue()+ " ");
            inOder(root.getRight());
        }
    }
    public void postOder(TreeNode root){ // L - R - N
        if(root == null ){
            return;
        }else{
            postOder(root.getLeft());
            postOder(root.getRight());
            System.out.print(root.getValue()+ " ");
        }
    }

    // tim gia tri trong cay
    public TreeNode searchBst(TreeNode root, int value){
        // truong hop root == null thi return null luon

        if(root == null){
            return null;
        }
        // truong hop con lai
        if(value < root.getValue()){
            return searchBst(root.getLeft(), value);
        }else if(value > root.getValue()){
            return searchBst(root.getRight(), value);
        }else{
            return root;
        }

    }


    //tim node ben trai cung cua root
    public TreeNode findLeftModeNode(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode wantedNode = root;
        while(wantedNode != null){
            wantedNode = wantedNode.getLeft();
        }
        return wantedNode;
    }

    // xoa node value trong cay root
    // return lai cay da xoa node value
    public TreeNode deleteNode(TreeNode root, int value) {
        // truong hop root == null
        if (root == null) {
            return null;
        }
        //truong hop root khac null
        //b1: di tim node de xoa
        // xet gia tri value voi gia tri root
        if(value < root.getValue()){ // neu nho hon thi gan nhanh ben trai bang gia tri moi cua mot cay con da duoc xoa gia tri value roi.
            root.setLeft(deleteNode(root.getLeft(),value));
        }else if(value > root.getValue()){// neu lon hon  thi cung set ben phai bang gia tri moi cua cay con da duoc xoa gia tri value
            root.setRight(deleteNode(root.getRight(),value));

            // b2: da xac dinh duoc node can xoa khi gia tri value = gia tri root
        }else{
            // truong hop tong quat cua ham xoa khi ma gia tri val == gia tri root. xac dinh duoc node da xoa
            // th1 : root la node la (khong co node con)
            if(root.getRight() == null && root.getLeft() == null){
                return null;
            }
            // th2  :chi 1 co cay con ben trai
            if(root.getLeft() !=null && root.getRight() == null){
                return root.getLeft();
            }
            //th 2 : chi 1 co cay con ben phai
            if(root.getLeft() == null && root.getRight() != null){
                return root.getRight();
            }
            //th3: ton tai 2 cay con.
            // tim node trai cung cua cay con ben phai
            TreeNode leftNode = findLeftModeNode(root.getRight());// tao node moi la node cuoi cung ben trai cua cay con ben phai
            root.setValue(leftNode.getValue());// gan gia tri cua node root da tim duoc o ben tren bang gia tri cua node ben trai duoi cung cua cay con ben phai
            root.setRight(deleteNode(root.getRight(), leftNode.getValue()));// goi lai ham de quy cua xoa node ben phai voi gia tri la node ben trai duoi cung cua cay con ben phai.

        }

        return root;
    }

    public TreeNode insert(TreeNode root, int value) {
        //th1 : root = null
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.getValue()) { // value nhap vao lon hon gia tri root thi xet 2 truong hop sau :
                    if (temp.getRight() == null) { // neu gia tri ben phai cua node la null thi gan luon ben phai node la newnode
                        temp.setRight(newNode);
                        break;
                    } else {// neu gia tri ben phai node khac null thi phai di tiep node tiep theo ben phai
                        temp = temp.getRight();
                    }

                } else {// value < node.getvalue
                    if (temp.getLeft() == null) {
                        temp.setLeft(newNode);
                        break;
                    } else {
                        temp = temp.getLeft();
                    }
                }
            }
        }
        return root;
    }

    //chen vao BST dung de quy
    //
    public TreeNode insertUseCursion(TreeNode rootNode, int value){
        // tao node moi
        TreeNode newNode = new TreeNode(value);
        // th root == null
        if(rootNode == null){
            rootNode = newNode;
            return rootNode;
        }
        // th root != null, chia lam 2 truong  hop con, lon hon va nho hon.

        if(value < rootNode.getValue()){// gia tri chen vao nho hon node
            if(rootNode.getLeft() == null){ // xet truong hop node hien tai ben trai null thi set luon gia tri
                rootNode.setLeft(newNode);
            }else{// neu node ben trai khong null thi di tiep ve ben trai bang de quy
                insertUseCursion(rootNode.getLeft(),value);
            }

        }else{// th gia tri lon hon node
            if(rootNode.getRight() == null ){// truong hop ben phai bang null thi set luon gia tri newnode
                rootNode.setRight(newNode);
            }else{ // truong hop ben phai khong phai null thi di tiep ve ben phai dung de quy
                insertUseCursion(rootNode.getRight(),value);
            }

        }
        return rootNode;
    }


    public void init() {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n0.setLeft(n1);
        n0.setRight(n2);
        n1.setLeft(n3);
        n1.setRight(n4);
        n2.setRight(n5);


    }
}
