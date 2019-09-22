package offer.offer_4;

public class P194_Tesy37_1 {
/*
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    int index = -1;
    TreeNode Deserialize(String str) {
        index++;
        int len = str.length();
        if(index >= len) return null;
        String[] str1 = str.split(",");
        TreeNode node = null;
        if(!str1[index].equals("#")){
            node = new TreeNode(Integer.valueOf(str1[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
    */

    void Serialize(BinaryTreeNode pRoot){
        if(pRoot == null ){
            System.out.println("$");
            return;
        }
        System.out.println(pRoot.value);
        Serialize(pRoot.pleft);
        Serialize(pRoot.pright);
    }


}
