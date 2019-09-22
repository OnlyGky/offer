package offer.offer_2;

/**
 * 其实就是通过二分法不断的缩短范围先判断 1—Middle之间的数有多少，大于Middle的就肯定有重复的值，
 * 则在这个范围内再次二分即可
 *
 */
public class P41_Test3_3 {
    public static void main(String[] args) {
        int []a = new int[]{2,3,1,0,2,5,3};
        int []b = new int[1];
        System.out.println();
    }



    static int getDuplication(int a[], int len){
        int start = 1;
        int end = len-1;
        while(end>=start){
            int middle = ((end-start)>>1)+start;
            int count = countRange(a,len,start,middle);
            if(end==start){//当起点和终点相等时
                if(count>1){
                    return start;
                }else{
                    break;
                }
            }
            if(count>(middle-start+1)) //如果在satart到Middle的数字范围间的数字大于这个范围则肯定有重复的数
                end = middle;
            else
                start = middle+1;
        }
        return -1;
    }

    private static int countRange(int[] a, int len, int start, int end) {
        if(a==null)
            return 0;
        int count = 0;
        for(int i=0;i<len;i++){//这是为了记录在start-end之间范围的数字有多少
            if(a[i]>=start && a[i]<=end){
                ++count;
            }
        }
        return count;
    }

}
