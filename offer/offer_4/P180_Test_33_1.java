package offer.offer_4;

/**
 * 二叉树的后序遍历
 */
public class P180_Test_33_1 {

    int count = 0 ;
    public static void main(String[] args) {
        int []a = {5,7,6,9,11,10,8};
        System.out.println( new P180_Test_33_1().VerifySequenceOfBST(a,0,a.length-1));
    }
    public boolean VerifySequenceOfBST(int [] sequence, int start, int end){
        if(sequence == null || sequence.length == 0)
            return false;
        if(start<0 || end >sequence.length)
            return false;
        int root = sequence[end];

        //在二叉搜索树中左子树的节点小于根节点
        int i = start;
        for(;i<end;i++){
            if(sequence[i]>root)
                break;
        }

        //在二叉搜索树中右子树的节点大于根节点
        int j = i;
        for(; j<end;j++){
            if(sequence[j]<root)
                return false;
        }

        //判断左子树是不是二叉搜索树
        boolean left = true;
        if(i>start)
            left = VerifySequenceOfBST(sequence, start, i-1);

        //判断右子树是不是二叉搜索树
        boolean right = true;
        if(j<end)
            right = VerifySequenceOfBST(sequence, i,end-1);

        return left&&right;
    }

}
