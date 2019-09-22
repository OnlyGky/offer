package offer.offer_4;

import java.util.Stack;

/**
 * 栈的压入弹出顺序
 */
public class P168_Test31_1 {
    public static void main(String[] args) {
        int []pPush = {1,2,3,4,5};
        int []pPop = {4,5,3,2,1};
        System.out.println(new P168_Test31_1().IsPopOrder(pPush,pPop));
    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean bPossible = false;
        if(pushA == null && popA == null)
            return false;
        Stack stack = new Stack();
        int index = 0;
        int indexpush = 0;
        while(index < pushA.length){
            while(stack.isEmpty() || (Integer) stack.peek() != popA[index]){
                if (indexpush >= pushA.length)
                    break;
                stack.push(pushA[indexpush]);
                indexpush++;
            }
            if((Integer)stack.peek() != popA[index])
                break;
            stack.pop();
            index++;
            if(stack.isEmpty() && index >= popA.length)
                bPossible = true;
        }
        return  bPossible;
    }

    boolean IsPopOrder(int[] pPush,int[] pPop,int length){
        boolean bPossible = false;
        if(pPush != null && pPop != null && length >0){
            Stack stack = new Stack();
            int index = 0;
            int indexpush = 0;
            while (index<length){
                while(stack.empty() || (Integer) stack.peek() != pPop[index] ){
                    if (indexpush>=length)
                        break;
                    stack.push(pPush[indexpush]);
                    indexpush++;
                }
                if ((Integer) stack.peek() != pPop[index])
                    break;
                stack.pop();
                index++;
            }
            if (stack.empty() && index==length)
                return true;
        }
        return bPossible;
    }

}
