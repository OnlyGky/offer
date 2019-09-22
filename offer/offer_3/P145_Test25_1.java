package offer.offer_3;

/**
 * 合并两个排序的链表
 */
public class P145_Test25_1 {
    Node Merge(Node pHead1,Node pHead2){
        if(pHead1 == null)
            return pHead2;
        else if(pHead2 == null)
            return pHead1;
        Node pMergeHead = null;
        if(pHead1.value < pHead2.value){
            pMergeHead = pHead1;
            pMergeHead.next = Merge(pHead1.next,pHead2);
        }else {
            pMergeHead = pHead2;
            pMergeHead.next = Merge(pHead1,pHead2.next);
        }
            return pMergeHead;
    }
}
