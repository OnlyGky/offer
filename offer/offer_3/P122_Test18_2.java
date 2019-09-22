package offer.offer_3;

public class P122_Test18_2 {
    public void DeleteDuplication(Node head){
        if(head==null)
            return;
        Node pPreNode = null;
        Node pNode = head;
        while(pNode!=null){
            Node pNext = pNode.next;
            boolean needDelete = false;
            if(pNext !=null &&pNext.value==pNode.value){
                needDelete = true;
            }
            if(!needDelete){
                pPreNode = pNode;
                pNode = pNode.next;
            }else {
                int value = pNode.value;
                Node pToDelete = pNode;
                while(pToDelete!= null && pToDelete.value==value){
                    pNext = pToDelete.next;
                    pToDelete = null;
                }
                if(pPreNode ==null){
                    head = pNext;
                }else pPreNode.next = pNext;
                pNode = pNext;
            }
        }
    }
}
