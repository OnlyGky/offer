package offer.offer_6;

/**
 * 后序遍历记录每个节点的深度
 */
public class P274_Test_54_2 {
/*
 boolean isBalanced =false;
        public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeNode root) {
        if(root == null) {
            isBalanced = true;
            return 0;
        }
        int left = getDepth(root.left);//左子树
        int right = getDepth(root.right);//右子树
        int depth = (left > right ? left : right) + 1;
        if(Math.abs(left - right) <= 1) {
            isBalanced = true;
        } else {
            isBalanced = false;
        }
        return depth;//下层的深度，上层可以接着用免得再遍历
    }
 */
    boolean isBalanced(BinaryTreeNode proot, int pDepth){
        if (proot == null){
            pDepth = 0;
            return true;
        }
        int left = 0, rigth = 0;
        if (isBalanced(proot.left, left)  && isBalanced(proot.right, rigth)){
            int diff = left - rigth;
            if (diff <= 1 && diff >= -1){
                pDepth = 1 + (left > rigth ? left : rigth);
                return true;
            }
        }
        return false;
    }
}
