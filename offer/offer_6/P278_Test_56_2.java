package offer.offer_6;

public class P278_Test_56_2 {
    public int FindANumAppearOnce1(int[] array) throws Exception{
        if(array == null || array.length ==0)
            throw new Exception("无效输入");

        //定义一个数组来存储数组中每一个数字的32位数的和
        int[] bitSum = new int[32];

        //遍历数组
        for(int i=0; i < array.length; i++){
            int bitMask = 1;

            //遍历从后往前存储数字的每一位数
            for(int j=31; j >= 0; j--){
                int bit = array[i] & bitMask; //找到array[i]该位上的数字

                if(bit != 0){
                    bitSum[j] = bitSum[j] + bit;
                }

                bitMask = bitMask << 1; //bitMask每次向左移一位
            }
        }

        int result = 0;
        for(int i=0; i<32; i++){
            result = result + bitSum[i] % 3;
        }
        return result;
    }
}
