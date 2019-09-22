package offer.offer_5;

public class P253_Test_52_1 {
    /**
     public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
     ListNode one = pHead1;
     ListNode two = pHead2;
     int countone = 0;
     int counttwo = 0;
     while(one !=null){
     one = one.next;
     countone++;
     }
     while(two !=null){
     two = two.next;
     counttwo++;
     }
     int count = counttwo - countone;
     if(count >=0){
     while(count >0){
     pHead2 = pHead2.next;
     count--;
     }
     }else{
     while(count <0){
     pHead1 = pHead1.next;
     count++;
     }
     }
     while(pHead1 != pHead2 ){
     pHead1 = pHead1.next;
     pHead2 = pHead2.next;
     }
     return pHead2;
     }
     */


    ListNode FindFirstCommonNode(ListNode pheadone, ListNode pheadtwo){
        int lengthone = getListLength(pheadone);
        int lengthrtwo = getListLength(pheadtwo);
        int nLenDif = lengthone -lengthrtwo;
        ListNode PlistHeadlong  = pheadone;
        ListNode PlistHeadshort  = pheadtwo;
        if (lengthrtwo > lengthone){
            PlistHeadlong = pheadtwo;
            PlistHeadshort = pheadone;
            nLenDif = lengthrtwo -lengthone;
        }
        for (int i = 0; i < nLenDif; ++i){
            PlistHeadlong = PlistHeadlong.next;
        }
        while (PlistHeadlong != null && PlistHeadshort != null && PlistHeadlong != PlistHeadshort){
            PlistHeadlong = PlistHeadlong.next;
            PlistHeadshort = PlistHeadshort.next;
        }
        return PlistHeadlong;
    }

    private int getListLength(ListNode pheadtwo) {
        int count = 0;
        while (pheadtwo != null){
            count++;
        }
        return count;
    }


}
class ListNode{
    int value;
    ListNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}