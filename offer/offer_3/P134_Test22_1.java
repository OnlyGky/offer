package offer.offer_3;

/**
 * 链表到倒数第k个数
 */
public class P134_Test22_1 {

//    public ListNode FindKthToTail(ListNode head,int k) {
//        int length = 0;
//        ListNode temp = head;
//        while(temp != null){
//            length++;
//            temp = temp.next;
//        }
//        if (k > length)
//            return null;
//        int count = length - k;
//        for(int i = 0; i < count; i++){
//            head = head.next;
//        }
//        return head;
//    }

    public Node FindKthToTail(Node head,int k){
        if (head == null || k == 0)
            return null;
        Node pAhead = head;
        Node pBehind = null;
        for(int i = 0;i< k-1;i++){
            if(pAhead.next!= null)
                pAhead = pAhead.next;
            else return null;
        }
        pBehind = head;
        while(pAhead.next!=null){
            pAhead = pAhead.next;
            pBehind = pBehind.next;

        }
        return pBehind;
    }
}

