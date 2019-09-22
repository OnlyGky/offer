package offer.offer_4;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P182_Test_34_1 {
//    private ArrayList<Integer> list = new ArrayList<Integer>();
//    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
//        if(root == null) return listAll;
//        list.add(root.val);
//        target -= root.val;
//        if(target == 0 && root.left == null && root.right == null)
//            listAll.add(new ArrayList<Integer>(list));
//        FindPath(root.left, target);
//        FindPath(root.right, target);
//        list.remove(list.size()-1);
//        return listAll;
//    }

    void FindPath(BinaryTreeNode pProot, int sum){
        if(pProot == null){
            return;
        }
        int currentSum = 0;
        Stack stack = new Stack();
        FindPath(pProot,sum,stack,currentSum);
    }

    private void FindPath(BinaryTreeNode pProot, int sum, Stack stack, int currentSum) {
        currentSum +=pProot.value;
        stack.push(pProot.value);
        boolean isLeaf = (pProot.pleft ==null && pProot.pright == null);
        if(currentSum == sum && isLeaf){
            while (!stack.isEmpty()){
                System.out.println(stack.peek());
            }
        }
        if(pProot.pleft !=null){
            FindPath(pProot.pleft,sum,stack,currentSum);
        }
        if(pProot.pright !=null){
            FindPath(pProot.pright,sum,stack,currentSum);
        }
        stack.pop();
    }
}
