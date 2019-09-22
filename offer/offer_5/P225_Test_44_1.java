package offer.offer_5;

public class P225_Test_44_1 {
    int digitAtIndex(int index){
        if (index < 0)
            return -1;
        int digits = 1;
        while(true){
            int numbers = countOfIntegers(digits);
            if (index < numbers * digits) //
                return digitAtIndex(index, digits);
            index -= digits * numbers;
        }
    }

    private int digitAtIndex(int index, int digits) {
        int number = beginNumber(digits) + index/digits; //找到m位开始的哪位数
        int indexFormRight = digits - index%digits; //找到是那个数的第几位
        for (int i =1; i< indexFormRight; i++){
            number /=10;
        }
        return number%10;
    }

    private int beginNumber(int digits) {
        if (digits == 1)
            return 0;
        return (int) Math.pow(10, digits-1);
    }

    //得到 m位的数字总共有几个
    private int countOfIntegers(int digits) {
        if (digits == 1)
            return 10;
        int count = (int) Math.pow(10, digits-1);
        return 9 * count;
    }

    public static void main(String[] args) {

    }
}
