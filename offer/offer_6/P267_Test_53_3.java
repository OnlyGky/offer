package offer.offer_6;

public class P267_Test_53_3 {
    int GetNumberSame(int[] number, int length){
        if (number == null || length <= 0)
            return -1;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int middle = left +((right - left) >> 1);
            if (number [middle] == middle)
                return middle;
            if (number[middle] > middle)
                return middle - 1;
            else left = middle + 1;

        }
        return -1;
    }
}
