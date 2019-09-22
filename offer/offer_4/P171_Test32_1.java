package offer.offer_4;

import java.util.*;

/**
 * 面试题32的三道题
 */
public class P171_Test32_1 {
    /**
     * offer 把二叉树打印成多行
     */
    /**
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<TreeNode> roots = new ArrayList<TreeNode>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null)
            return list;
        roots.add(pRoot);
        while(!roots.isEmpty()){
            int count = roots.size();
            if(count >=0){
                ArrayList<Integer>  one = new ArrayList<Integer>();
                while(count > 0){
                    pRoot = roots.remove(0);
                    count--;
                    one.add(pRoot.val);
                    if(pRoot.left != null)
                        roots.add(pRoot.left);
                    if(pRoot.right != null)
                        roots.add(pRoot.right);
                }
                list.add(one);
            }
        }
        return list;
    }**/




    /**
     * 分行从上到下打印二叉树
     */
    /**
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        ArrayList<TreeNode>node = new ArrayList<TreeNode>();
        if(root == null)
            return list;
        node.add(root);

        while(node.size() > 0){
            TreeNode temp = node.remove(0);
            list.add(temp.val);
            if(temp.left != null){
                node.add(temp.left);
            }
            if(temp.right != null){
                node.add(temp.right);
            }
        }
        return list;
    }**/
    void PrintFromToToButton(BinaryTreeNode pTreeRoot){
        if(pTreeRoot == null)
            return;
        List list = new LinkedList<BinaryTreeNode>();

        list.add(pTreeRoot);
        while (list.size()>0){
            BinaryTreeNode pNode = (BinaryTreeNode)((LinkedList) list).getFirst();
            ((LinkedList) list).remove(0);
            System.out.println(pNode.value);
            if(pNode.pleft != null){
                list.add(pNode.pleft);
            }
            if(pNode.pright !=null )
                list.add(pNode.pleft);
        }

    }

    /**
     * 分行从小到下打印二叉树
     */
    void Print (BinaryTreeNode pRoot){
        if(pRoot == null){
            return;
        }
        List list = new LinkedList<BinaryTreeNode>();
        list.add(pRoot);
        int nextLevel = 0;
        int toBePrint = 1;
        while (!list.isEmpty()){
            BinaryTreeNode pNode = (BinaryTreeNode)((LinkedList) list).getFirst();
            System.out.print(pNode.value);
            if (pNode.pleft != null){
                list.add(pNode.pleft);
                ++nextLevel;
            }
            if (pNode.pright != null){
                list.add(pNode.pright);
                ++nextLevel;
            }
            ((LinkedList) list).remove(0);
            --toBePrint;
            if (toBePrint <= 0){
                System.out.println();
                toBePrint = nextLevel;
                nextLevel = 0;
            }
        }

    }

    /**
     * 之字型打印二叉树
     */
    /* 剑指offer
     public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null)
            return list;

         Stack levelone = new Stack<TreeNode>();
         Stack leveltwo = new Stack<TreeNode>();
        Stack []levelall = new Stack[]{levelone,leveltwo};
       int current = 0;
       int  next = 1;
       levelall[current].push(pRoot);
        ArrayList<Integer> one = new ArrayList<Integer>();
       while (!levelall[0].isEmpty() || !levelall[1].isEmpty()){
           TreeNode node = (TreeNode) levelall[current].pop();

           one.add(node.val);
           if(current == 0){
               if(node.left != null)
                    levelall[next].push(node.left);
               if(node.right != null)
                    levelall[next].push(node.right);
           }else{
               if(node.right != null)
                    levelall[next].push(node.right);
               if(node.left != null)
                    levelall[next].push(node.left);
           }
           if(levelall[current].empty()){
               list.add(one);
               one  = new ArrayList<Integer>();
               current = 1 - current;
               next = 1 - next;
           }
       }
        return list;
    }

     */

    void reservePrint(BinaryTreeNode pRoot){
        if(pRoot == null){
            return;
        }
        Stack levelone = new Stack<BinaryTreeNode>();
        Stack leveltwo = new Stack<BinaryTreeNode>();
       Stack []levelall = {levelone,leveltwo};
       int current = 0;
       int  next = 1;

       levelall[current].push(pRoot);
       while (!levelall[0].empty() || !levelall[1].empty()){
           BinaryTreeNode pNode = (BinaryTreeNode) levelall[current].pop();
           System.out.print(pNode.value);
           if(current == 0){
               if(pNode.pleft !=null){
                   levelall[next].push(pNode.pleft);
               }
               if(pNode.pright !=null){
                   levelall[next].push(pNode.pright);
               }
           }else {
               if(pNode.pright !=null){
                   levelall[next].push(pNode.pright);
               }
               if(pNode.pleft !=null){
                   levelall[next].push(pNode.pleft);
               }
           }
           if(levelall[current].empty()){ //current代表偶数栈，next代表奇数栈，第一层默认为0
               System.out.println();
               current = 1-current;
               next = 1-next;
           }
       }
    }

}
