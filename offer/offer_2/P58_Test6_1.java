package offer.offer_2;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class P58_Test6_1 {

    public ArrayList<Integer> printListFromTailToHead(Node listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Node tmp = listNode;
        while(tmp!=null){
            list.add(0,tmp.val);
            tmp = tmp.next;
        }
        return list;
    }

//    public static void main(String[] args) {
//        Node node = new Node();
//
//    }
//    void PrintListResersingly_Iteratively(Node node){
//        Stack stack = new Stack();
//        while (node!=null){
//            stack.push(node);
//            node = node.pnext;
//        }
//        while(!stack.isEmpty()){
//            node = (Node) stack.pop();
//            System.out.println(node.a);
//        }
//    }

}
class Node{
    int val;
    Node next;

}