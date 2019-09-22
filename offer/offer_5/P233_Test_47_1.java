package offer.offer_5;

/**
 * 礼物的最大值
 */
public class P233_Test_47_1 {

    int getMaxValue_solution(int [][] values, int rows, int cols){
        if (values == null || rows <= 0 ||cols <= 0 )
            return 0;
        int[] maxValue = new int[cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                int left = 0;
                int up = 0;
                if (i > 0)
                    up = maxValue[j];
                if (j > 0)  //判断是不是第一列上的数
                    left = maxValue[j-1];
                maxValue[j] = Math.max(left, up) + values[i][j];
            }
        }
        int max = maxValue[cols-1];
        return max;
    }
}
