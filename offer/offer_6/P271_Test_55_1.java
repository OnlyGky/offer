package offer.offer_6;

public class P271_Test_55_1 {

//    public int TreeDepth(TreeNode root) {
//        if(root== null)
//            return 0;
//        int left = 0;
//        int right = 0;
//
//        left = 1 + TreeDepth(root.left);
//        right = 1 + TreeDepth(root.right);
//        return left > right ? left : right;
//    }

     int TreeDepth(BinaryTreeNode node){
         if (node == null){
             return 0;
         }
         int left = TreeDepth(node.left);
         int right = TreeDepth(node.right);
         return (left > right) ? (left + 1) : (right + 1);
     }
}
