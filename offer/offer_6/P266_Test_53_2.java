package offer.offer_6;

public class P266_Test_53_2 {

    int GetMissingNumber(int[] number, int length) {
        if (number == null || length <= 0)
            return -1;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int middel = (right + left) >> 1;
            if (number[middel] != middel) {
                if (middel == 0 || number[middel - 1] == middel - 1)
                    return middel;
                right = middel - 1;
            } else left = middel + 1;
        }
        if (left == length)
            return length;
        return -1;
    }
}
