package offer.offer_4;

import java.util.Stack;

/**
 * 获得该栈的最小元素
 * 不用将最小元素弹出
 */
public class P165_Test_30_1 {
    /**
     * Stack m_min = new Stack(); //铺助栈
     *     Stack m_data = new Stack(); //数据栈
     *
     *     public void push(int node) {
     *         m_data.push(node);
     *         if(m_min.isEmpty())
     *             m_min.push(node);
     *         else{
     *             if(node < (Integer)m_min.peek())
     *                 m_min.push(node);
     *             else{
     *                 m_min.push(m_min.peek());
     *             }
     *         }
     *     }
     *
     *     public void pop() {
     *         if(m_data.size() > 0 && m_min.size() > 0) {
     *                 m_min.pop();
     *                 m_data.pop();
     *             }
     *     }
     *
     *     public int top() {
     *         return (Integer)m_data.peek();
     *     }
     *
     *     public int min() {
     *         if(m_min.size() > 0)
     *             return (Integer)m_min.peek();
     *         return 0;
     *     }
     */

    Stack m_min = new Stack(); //铺助栈
    Stack m_data = new Stack(); //数据栈
    public static void main(String[] args) {

    }
    void getHead(){

            if(m_data.size() > 0 && m_min.size() > 0) {
                m_min.pop();
                m_data.pop();
            }


    }

    void StackWithMin(Integer value){
        m_data.push(value);
        if(m_min.size() == 0 || value < (Integer) m_min.peek())
            m_min.push(value);
    }



    Integer min(){
        if(m_min.size() > 0)
            return (Integer) m_min.pop();
        return (Integer) m_data.pop();
    }
}
