package offer.offer_5;

/**
 * 连续子数组的最大和
 */
public class P218_Test_42_1 {

//    public int FindGreatestSumOfSubArray(int[] array) {
//        if(array == null)
//            return 0;
//        int max = 0;
//        int sum = Integer.MIN_VALUE;
//        for(int i = 0; i < array.length; i++){
//            if(max <= 0){
//                max = array[i];
//            }else{
//                max+=array[i];
//            }
//            if(max > sum)
//                sum = max;
//        }
//        return sum;
//    }

    int findGreatestSumoOfSubArray(int[] pData,int length){
        if (pData == null || length == 0){
            return 0;
        }
        int nCurSum = 0;
        int nGreateSum = Integer.MAX_VALUE;
        for (int i = 0;i<length;i++){
            if (nCurSum <= 0){
                nCurSum = pData[i];
            }
            else
                nCurSum+=pData[i];
            if (nCurSum > nGreateSum)
                nGreateSum = nCurSum;
        }
        return nGreateSum;
    }
}
