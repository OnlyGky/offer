package offer.offer_3;

/**
 * 链表中环的入口
 */
public class P139_Test23_1 {
    /**
     * 在环存在的情况下找到两个指针相遇的节点
     */
        Node MeetingNode(Node pHead){
            if(pHead == null)
                return null;
            Node pSlow = pHead.next;
            if(pSlow == null)
                return null;
            Node pFast = pSlow.next;
            while (pFast!=null && pSlow!=null){
                if(pSlow == pFast)
                    return pFast;
                pSlow = pSlow.next;

                pFast = pFast.next;
                if (pFast !=null){
                    pFast = pFast.next;
                }
            }
            return null;
        }

    /**
     * 找到环中的入口节点
     * @param pHead
     * @return
     */
    Node EntryNodeOfLoop(Node pHead){
            Node meetingNode = MeetingNode(pHead);
            if (meetingNode == null)
                return null;
            int nodesInLoop = 1;
            Node pNodeone = meetingNode;
            while(pNodeone.next!=meetingNode){ //判断出环的长度
                pNodeone = pNodeone.next;
                ++nodesInLoop;
            }
            pNodeone = pHead;
            for(int i =0;i<nodesInLoop;i++ ){
                pNodeone = pNodeone.next;
            }
                Node pNodetwo = pHead;
            while (pNodeone != pNodetwo){
                pNodeone = pNodeone.next;
                pNodetwo = pNodetwo.next;
            }
            return pNodeone;

        }
}
