package offer.offer_2;

/**
 * 找到二叉树中序遍历的下一个节点
 */
public class P65_Test8_1 {
    /*
     public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
            if(pNode.right != null){
                TreeLinkNode temp = pNode.right;
                while(temp.left!=null)
                    temp = temp.left;
                return temp;
            }else {
               if(pNode.next != null){
                   TreeLinkNode pCurrent = pNode;
                   TreeLinkNode p = pNode.next;
                   while(p != null && pCurrent == p.right){
                       pCurrent = p;
                       p = p.next;

                   }
                   return p;
               }
            }
            return null;


    }
     */

    public TreeNode getNext(TreeNode node){
        if(node==null){
            return null;
        }
        if(node.right!=null){
            TreeNode next = node.right;
            while(node.left!=null){
                node = node.left;
            }
            return node;
        }else if (node ==node.parent.left){
            return node.parent;
        }else if(node.parent!=null){
            TreeNode tNode = node;
            TreeNode pNode = node.parent;
            while(pNode!=null&&tNode.parent==pNode.right){
                tNode = pNode;
                pNode = pNode.parent;
            }
            return pNode;
        }
        return null;
    }
}
