package offer.offer_6;

public class P269_Test_54_1 {

//    int t = 0;
//    TreeNode KthNode(TreeNode pRoot, int k)
//    {
//        if(pRoot == null || k == 0)
//            return null;
//        t = k;
//        return getNode(pRoot);
//
//    }
//    TreeNode getNode(TreeNode root){
//        TreeNode target = null;
//
//        if(root.left != null)
//            target =  getNode(root.left);
//        if(target == null){
//            if(t == 1)
//                target = root;
//            t--;
//        }
//        if(target == null && root.right !=null)
//            target = getNode(root.right);
//        return target;
//    }

    BinaryTreeNode KthNode(BinaryTreeNode root, int k){
        if (root == null || k == 0)
            return null;
        return KthNodeCore(root, k);
    }

    private BinaryTreeNode KthNodeCore(BinaryTreeNode root, int k) {
        BinaryTreeNode target = null;
        if (root.left != null)
            target = KthNodeCore(root.left, k);
        if (target == null){
            if (k == 1){
                target = root;
            }
            k--;
        }
        if (target == null && root.right != null)
            target = KthNodeCore(root.right, k);
        return target;
    }

}
class BinaryTreeNode{
    int value;
    BinaryTreeNode right;
    BinaryTreeNode left;
}