package offer.offer_6;

import java.util.ArrayList;

public class P282_Test_57_2 {

    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        if(sum < 3)
            return list;
        int middle = (sum + 1) / 2;
        int small = 1;
        int big = 2;
        int currentsum = small+big;
        while(small < middle){
            if(currentsum == sum)
                count(small, big);
            while(currentsum > sum && small < middle){
                currentsum-=small;
                small++;
                if(currentsum == sum)
                    count(small, big);
            }
            big++;
            currentsum+=big;
        }
        return list;
    }
    private void count(int small, int big){
        ArrayList<Integer> one = new ArrayList<Integer>();
        for(int i = small; i <=big; i++){
            one.add(i);
        }
        list.add(one);
    }


    void FindContinuousSeqience(int sum){
        if (sum < 3)
            return;
        int small = 1;
        int big = 2;
        int middle = (sum + 1) / 2;
        int cursum = small + big;
        while (small < middle){
            if (cursum == sum)
                PrintComtinuousSequence(small, big);
            while (cursum > sum && small < middle){
                cursum -= small;
                small++;
                if (cursum == sum)
                    PrintComtinuousSequence(small, big);
            }
            big ++;
            cursum += big;
        }
    }

    private void PrintComtinuousSequence(int small, int big) {
        for (int i = small; i<= big; i++){
            System.out.print(i);
        }
    }
}
