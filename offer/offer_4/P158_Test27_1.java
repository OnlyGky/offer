package offer.offer_4;

/**
 *二叉树的镜像
 */
public class P158_Test27_1 {
    void MirrorTree(BinaryTreeNode pnode){
        if(pnode == null)
            return;
        if(pnode.pleft == null && pnode.pright == null){
            return;
        }
        BinaryTreeNode pTemp = pnode.pleft;
        pnode.pleft = pnode.pright;
        pnode.pright=pTemp;
        if(pnode.pleft!=null)
            MirrorTree(pnode.pleft);
        if (pnode.pright!=null)
            MirrorTree(pnode.pright);
    }
}
class BinaryTreeNode{
    BinaryTreeNode pleft;
    BinaryTreeNode pright;
    int value;
}
