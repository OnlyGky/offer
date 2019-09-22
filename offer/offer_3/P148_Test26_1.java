package offer.offer_3;

/**
 * 树的子结构
 */
public class P148_Test26_1 {

//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        boolean result = false;
//        if(root1 != null && root2 != null){
//            if(root1.val == root2.val)
//                result = DoersHaveTree(root1, root2);
//            if(!result)
//                result = DoersHaveTree(root1.left, root2);
//            if(!result)
//                result = DoersHaveTree(root1.right, root2);
//        }
//        return result;
//    }
//    boolean DoersHaveTree(TreeNode rootOne,TreeNode rootTwo){
//        if(rootTwo == null)
//            return true;
//        if(rootOne == null)
//            return false;
//        if(rootOne.val != rootTwo.val){
//            return false;
//        }
//        return DoersHaveTree(rootOne.left,rootTwo.left)&&
//                DoersHaveTree(rootOne.right,rootTwo.right);
//    }

    boolean HasSubtree(TreeNode rootOne,TreeNode rootTwo){
        boolean result = false;
        if(rootOne != null && rootTwo!=null){
            if(rootOne.value == rootTwo.value)
                result = DoersHaveTree(rootOne,rootTwo);
            if(!result){
                result = DoersHaveTree(rootOne.pLeft,rootTwo);
            }
            if(!result){
                result = DoersHaveTree(rootOne.pRight,rootTwo);
            }
        }
        return result;
    };

    boolean DoersHaveTree(TreeNode rootOne,TreeNode rootTwo){
        if(rootTwo == null)
            return true;
        if(rootOne == null)
            return false;
        if(rootOne.value != rootTwo.value)
            return false;
        return DoersHaveTree(rootOne.pLeft,rootTwo.pLeft)&&
                DoersHaveTree(rootOne.pRight,rootTwo.pRight);
    }
}
class TreeNode{
    int value;
    TreeNode pLeft;
    TreeNode pRight;
}
