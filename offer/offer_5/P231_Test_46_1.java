package offer.offer_5;

public class P231_Test_46_1 {

    public static void main(String[] args) {
        System.out.println(new P231_Test_46_1().getTranslationCount(12258));
    }
    int getTranslationCount(int number){
        if (number < 0){
            return 0;
        }
        String numberInString = Integer.toString(number);
        return getTranslationCount(numberInString);
    }

    private int getTranslationCount(String number) {
        char[] numbers = number.toCharArray();
        int length = number.length();

        int[] counts = new int[length];

        int count = 0;

        for (int i = length-1; i >= 0; --i){
            count = 0;
            if (i+1 < length){
                count = counts[i+1];
            }else
                count = 1; //如果是从最后一个开始的count等于1
            if (i +1 <length){
                int digit1 = numbers[i] - '0';
                int digit2 = numbers[i+1] - '0';

                int converted = digit1 * 10 + digit2;
                if (converted >= 10 && converted <= 25)
                {
                    if (i + 2 < length)
                        count += counts[i + 2];// 这里此时符合了递推公式
                    else
                        count += 1;  //count代表从当前值往后有几个变化
                }
            }
            counts[i] = count;
        }
        count = counts[0];
        return count;
    }
}
