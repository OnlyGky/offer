package offer.offer_2;

import java.lang.reflect.Array;
import java.util.EnumSet;

/**
 * 前序中序构建二叉树
 */
public class P62_Test7_1 {
    public static Node create(){
        return new Node();
    }
    public TreeNode buildTree(int[] qianxu, int[] zhonxu) {
        if(zhonxu==null||qianxu==null||zhonxu.length==0||qianxu.length==0) {
            return null;
        }
        TreeNode root=qianzhon(qianxu,0,qianxu.length-1,zhonxu,0,zhonxu.length-1);
        return root;
    }
    public TreeNode qianzhon(int[] qianxu,int qs,int qe,int[] zhonxu,int zs,int ze) {
        if(zs>ze||qs>qe) {
            return null;
        }
        int rootval=qianxu[qs];
        TreeNode root=new TreeNode(rootval);
        for(int i=zs;i<=ze;i++) {
            if(zhonxu[i]==rootval) {
                root=new TreeNode(rootval);
                //qs+i-zs = 前序开始的地方加上 中序根节点所在的位置减去起点就是根节点的左子树
                root.left=qianzhon(qianxu,qs+1,qs+i-zs, zhonxu,zs,i-1);
                //qe-ze+i+1 = 前序结束 - 中序结束 + 中序遍历根节点的下一位、、记住
                root.right=qianzhon(qianxu,qe-ze+i+1,qe, zhonxu,i+1,ze);
            }
        }
        return root;
    }
}
class TreeNode{
    int value;
    TreeNode left;
    TreeNode  right;
    TreeNode parent;
    public TreeNode(int value) {
        this.value = value;
    }
}