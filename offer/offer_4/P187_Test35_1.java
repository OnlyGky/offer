package offer.offer_4;

/**
 * 复杂链表的复制
 */
public class P187_Test35_1 {


    void CloneNode(Node head){
        Node node = head;
        while(node != null){
            Node pClone = new Node();
            pClone.value = node.value;
            pClone.next = node.next;
            pClone.pSibling = null;
            node.next = pClone;
            node = pClone.next;
        }
    }
    void ConnectSiblingNodes(Node head){
        Node node = head;
        while(node!=null ){
            Node clone = node.next;
            if(node.pSibling !=null){
                clone.pSibling = node.pSibling.next;
            }
            node = clone.next;
        }
    }
    Node RecopnnectNodes(Node head){
        Node pNode = head;
        Node cloneHead = null;
        Node cloneNode = null;
        if(pNode!=null){
            cloneHead = cloneNode = pNode.next;
            pNode.next = cloneNode.next;
            pNode = pNode.next;
        }
        while(pNode!=null){
            cloneNode.next = pNode.next;
            cloneNode = pNode.next;

            pNode.next = cloneNode.next;
            pNode = pNode.next;
        }
        return cloneHead;
    }
}
class Node{
    Node next;
    int value;
    Node pSibling;
}
