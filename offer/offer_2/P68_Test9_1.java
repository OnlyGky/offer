package offer.offer_2;

import java.util.Stack;

/**
 * 使用两个栈实现一个队列
 */
public class P68_Test9_1 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.empty()) {
            int a = stack2.peek();
            stack2.pop();
            return a;
        }
        else {
            while(!stack1.empty()) {
                int k = stack1.peek();
                stack2.push(k);
                stack1.pop();
            }
            int a = stack2.peek();
            stack2.pop();
            return a;
        }
    }
//    Stack stack1 = new Stack();
//    Stack stack2 = new Stack();
//
//    public  void add(int a){
//        stack1.add(a);
//    }
//
//    public int get(){
//        if(stack2.size()<=0){
//            while(stack1.size()>0){
//                stack2.push(stack1.pop());
//            }
//        }
//        return (int)stack2.pop();
//}
}
