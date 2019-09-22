package offer.offer_6;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class P288_Test_59_1 {

    public static void main(String[] args) {
        int[] a = new int[]{2,3,4,2,6,2,5,1};
        System.out.println(new P288_Test_59_1().maxInWindows(a,3));
    }
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {

        ArrayList<Integer> al = new ArrayList<Integer>();
        if (num.length < 1 || num.length < size || size < 1){
            return al;
        }

        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        for(int i = 0; i < size ; i++){
            while(!ad.isEmpty() && num[i] >= num[ad.getFirst()])
                ad.pollFirst();
            ad.add(i);
        }
        al.add(num[ad.getFirst()]);
        for(int i = size ; i < num.length; i++){
            int lower_bound = i - size + 1 ;


            while( !ad.isEmpty() && ad.getFirst() < lower_bound)
                ad.pollFirst();
            while( !ad.isEmpty() && num[ad.getLast()] <= num[i]){
                ad.pollLast();
            }

            ad.add(i);
            al.add(num[ad.getFirst()]);
        }
        return al;
    }
//    public ArrayList<Integer> maxInWindows(int[] num, int size){
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        if (num.length < 1 || num.length < size || size < 1){
//            return al;
//        }
//        int lower_bound;  //记录当前窗口的最小下标
//        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
//        for (int i = 0 ; i < num.length; i++){
//            lower_bound = i - size + 1;
//            if (ad.isEmpty())
//                ad.add(i);
//            else {
//                while (!ad.isEmpty() && num[i] > num[ad.getLast()])
//                    ad.pollLast();
//                ad.add(i);
//            }
//            while (! ad.isEmpty() && ad.getFirst() < lower_bound)
//                ad.pollFirst();
//            if (lower_bound >= 0)
//                ad.add(num[ad.getFirst()]);
//        }
//        return al;
//    }
}
