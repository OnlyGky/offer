package offer.offer_5;

import java.util.Arrays;

/**
 * 最小的k个数
 * 基于快排解决
 * 基于中位数解决
 */
public class P209_Test_40_1 {
//    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        if(k > input.length)
//            return new ArrayList<>();
//        Arrays.sort(input);
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < k; i++)
//            list.add(input[i]);
//        return list;
//    }

    void GetLeastNumber(int[] input, int n, int[] output, int k){

        if (input == null || output == null || k > n ||n <=0 || k<=0){
            return;
        }
        int start = 0;
        int end = n-1;
        int index = partition1(input, start, end); //快排定位中间节点
        while (index != k-1){
            if (index > k-1){
                end = index -1;
                index = partition1(input,start,end);
            }else {
                start = index -1;
                index = partition1(input,start,end);
            }
        }
        for (int i = 0;i <k;i++){
            output[i] = input[i];
        }

    }
    public static int partition1(int[] array,int lo,int hi){
        //以第一个值为基准值，当然你也可以3取1，

        int key=array[lo];
        while(lo<hi){
            while(array[hi]>key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }


}
