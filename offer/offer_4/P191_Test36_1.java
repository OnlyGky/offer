package offer.offer_4;

/**
 * 二叉搜索树与双向链表
 */
public class P191_Test36_1 {
//    TreeNode pLastNodeInList = null;//用来指向已经转换好后的链表的最后一个节点
//    public TreeNode Convert(TreeNode pRootOfTree) {//构建双向链表
//
//        ConvertNode(pRootOfTree);
//        TreeNode phead = pLastNodeInList;
//
//        while(phead != null && phead.left != null){
//            phead = phead.left;
//        }
//        return phead;
//    }
//    private void ConvertNode(TreeNode pRoot) {
//        if (pRoot == null){
//            return;
//        }
//        TreeNode pCurrent = pRoot;
//        if (pCurrent.left !=null ){  //一直往下遍历找到当前节点的左节点
//            ConvertNode(pCurrent.left);
//        }
//        pCurrent.left = pLastNodeInList;
//        if (pLastNodeInList !=null){
//            pLastNodeInList.right = pCurrent;
//        }
//        pLastNodeInList = pCurrent;
//        if (pCurrent.right !=null){
//            ConvertNode(pCurrent.right);
//        }
//    }

}
