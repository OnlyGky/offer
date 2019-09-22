package offer.offer_2;

/**
 * 旋转数组的最小数字
 */
public class P82_Test11_1 {

    public int minNumberInRotateArray(int [] array) {
        int indexleft = 0;
        int indexright = array.length - 1;
        int indexMid = 0;
        while (array[indexleft] >= array[indexright]){
            if(indexright-indexleft==1){
                indexMid = indexright;
                break;
            }
            indexMid = (indexleft + indexright)/2 ;
            if(array[indexleft]==array[indexright]&&array[indexleft]==array[indexMid]){
                return MinInOrder(array,indexleft,indexright);
            }
            if (array[indexMid] >= array[indexleft])
                indexleft = indexMid;
            else indexright = indexMid;
        }
        return array[indexMid];
    }

    private static int MinInOrder(int[] a, int indexleft, int indexright) {
        int result = a[indexleft];
        for(int i = indexleft;i<=indexright;i++){
            if(result>a[i])
                result=a[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int []a = {3,4,5,1,2};
        System.out.println(new P82_Test11_1().Min(a));
    }

    public int Min(int []a){
        int indexleft = 0;
        int indexright = a.length-1;
        int indexMid = indexleft; //防止旋转0位
        while(a[indexleft]>=a[indexright]){
            if(indexright-indexleft==1){
                indexMid = indexright;
                break;
            }
            indexMid = (indexleft+indexright)/2;
            //如果三个数字都相等只能顺序查找
            if(a[indexleft]==a[indexright]&&a[indexleft]==a[indexMid]){
                return MinInOrder(a,indexleft,indexright);
            }
            if(a[indexMid]>=a[indexleft])
                indexleft = indexMid;
            else
                indexright = indexMid;

        }
        return a[indexMid];
    }



}
