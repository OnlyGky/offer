package offer.offer_6;

public class P263_Test_53_1 {

    public static void main(String[] args) {
        System.out.println(new P263_Test_53_1().GetNumberOfK(new int[]{1,2,3,3,3,3,4,5}, 8,3));
    }

    int GetNumberOfK(int[] data, int length, int k){
        int number = 0;
        if (data != null && length > 0){
            int first = GetFirstK(data, length, k, 0 ,length-1); //找出第一个k出现的下标
            int last = GetLastK(data, length, k, 0, length-1);
            if (first > -1 && last > -1)
                number = last - first + 1;
        }
        return number;
    }

    private int GetLastK(int[] data, int length, int k, int start, int end) {
        if (start > end){
            return -1;
        }
        int middleIndex = (start + end)/2;
        int middleData = data[middleIndex];

        if (middleData == k){
            if ((middleIndex < length -1 && data[middleIndex + 1] != k) || middleIndex == 0)
                return middleIndex;
            else start = middleIndex +1;
        }
        else if (middleData < k)
            start = middleIndex + 1;
        else end = middleIndex - 1;
        return GetLastK(data, length, k, start, end);
    }

    private int GetFirstK(int[] data, int length, int k, int start, int end) {
        if (start > end){
            return -1;
        }
        int middleIndex = (start + end)/2;
        int middleData = data[middleIndex];

        if (middleData == k){
            if ((middleIndex > 0 && data[middleIndex - 1] != k) || middleIndex == length-1)
                return middleIndex;
            else end = middleIndex -1;
        }
        else if (middleData > k)
            end = middleIndex - 1;
        else start = middleIndex + 1;
        return GetFirstK(data, length, k, start, end);
    }

}
