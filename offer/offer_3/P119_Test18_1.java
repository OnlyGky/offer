package offer.offer_3;

public class P119_Test18_1 {
    //删除链表中重复的节点
//    public static ListNode deleteDuplication(ListNode pHead) {
//
//        ListNode first = new ListNode(-1);//设置一个trick
//
//        first.next = pHead;
//
//        ListNode p = pHead;
//        ListNode last = first;
//        while (p != null && p.next != null) {
//            if (p.val == p.next.val) {
//                int val = p.val;
//                while (p!= null&&p.val == val)
//                    p = p.next;
//                last.next = p;
//            } else {
//                last = p;
//                p = p.next;
//            }
//        }
//        return first.next;
//    }
    public void DeleteNode(Node head,Node todelete){
        if(head == null || todelete==null)
            return;
        //删除的节点不是尾节点
        if(todelete.next!=null){
            Node pnext = todelete.next;
            todelete.next = pnext.next;
            todelete.value = pnext.value;
            pnext = null;
        }

        //链表只有一个节点
        else if(head==todelete){
            head = todelete = null;
        }
        //删除的是链表的尾结点
        else{
            Node temp = head;
            while(temp.next!=todelete){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
}
class Node{
    Node next;
    int value;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }
}
