package offer.offer_3;

/**
 * 反转链表
 */
public class P142_Test24_1 {

//    public ListNode ReverseList(ListNode head) {
//        ListNode ReserveHead = new ListNode(0);
//        ReserveHead.next = null;
//        ListNode pHead = head;
//        while(pHead != null){
//            ListNode pNext = pHead.next;
//            pHead.next = ReserveHead.next;
//            ReserveHead.next = pHead;
//            pHead = pNext;
//        }
//        return ReserveHead.next;
//    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = null;
        new P142_Test24_1().reserve(n1);

    }

    void reserve(Node head){
        if(head==null)
            return;
        Node pnode = head;
        Node pHead = new Node();
        pHead.next = null;
        while(pnode != null){
           Node pNext = pnode.next; //记录下一个节点
           pnode.next = pHead.next;  //接下来这两行头插法
           pHead.next = pnode;
           pnode = pNext;
        }
        while (pHead.next!=null){
            System.out.println(pHead.next.value);
            pHead = pHead.next;
        }
    }
}
