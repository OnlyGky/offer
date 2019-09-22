package offer.offer_6;

import java.util.ArrayList;

public class P300_Test_62_1 {
    int lastRe(int n, int m){
        if (n < 1 || m < 1)
            return -1;
        int last = 0;
        for (int i = 2; i<= n; i++){
            last = (last+m)%i;
        }

        return last;
    }

    public static void main(String[] args) {
        new P300_Test_62_1().LastRemaining_Solution(5,3);
    }
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0)
            return -1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int current = 0;
        while(list.size()>1){

            for(int i = 1; i < m; i++){
                current++;
                if(current >= list.size())
                    current = 0;
            }


            System.out.println(list.remove(current));
            if(current >= list.size()){

                current = 0;
            }
        }
        return list.get(0);
    }
}
