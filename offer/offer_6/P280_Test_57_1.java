package offer.offer_6;

import java.util.ArrayList;

public class P280_Test_57_1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if(array == null ||array.length == 0)
            return new ArrayList();
        int start = 0;
        int end = array.length-1;
        ArrayList<Integer>list = new ArrayList<Integer>();
        while(start < end){
            if(array[start]+array[end] == sum){
                list.add(array[start]);
                list.add(array[end]);
                break;
            }else if(array[start]+array[end] < sum)
                start++;
            else end--;
        }
        return list;
    }

    boolean FindNumberWithSum(int[] data, int sum ){
        boolean found = false;
        int start = 0;
        int end = data.length-1;
        while (start < end){
            int curSum = data[start] + data[end];
            if (curSum == sum)
                return true;
            else if (curSum < sum)
                start ++ ;
            else end --;
        }
        return false;
    }
}
