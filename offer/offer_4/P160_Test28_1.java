package offer.offer_4;

public class P160_Test28_1 {

    boolean isSymmetrical(BinaryTreeNode proot){
        return isSymmetrical(proot,proot);
    }
    boolean isSymmetrical(BinaryTreeNode rootone,BinaryTreeNode roottwo){
        if (rootone == null && roottwo == null)
            return true;
        if (rootone == null || roottwo == null)
            return false;
        if(rootone.value != roottwo.value)
            return false;
        return isSymmetrical(rootone.pleft,roottwo.pright)
                && isSymmetrical(rootone.pright,roottwo.pleft);
    }
}
