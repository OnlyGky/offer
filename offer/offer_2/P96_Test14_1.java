package offer.offer_2;

/**
 * 减绳子
 */
public class P96_Test14_1 {
    public static void main(String[] args) {

        System.out.println(getMaxInt(5));
    }
    public int cutRope(int a) {
        int[] target = new int[a+1];
        if(a <= 3)
            return a-1;
        if(a == 4)
            return a;
        if(a == 5)
            return 6;
        if(a == 6)
            return 9;
        target[5] = 6;
        target[6] = 9;
        for(int i = 7; i<=a; i++){
            target[i] = target[i-2]*2;
        }
        return target[a];
    }

    public static int getMaxInt(int length){
        if(length<=3){
            return length-1;
        }
        int []pro = new int[length+1];
        pro[0] = 0;
        pro[1] = 1;
        pro[2] = 2;
        pro[3] = 3;

        int max = 0;
        for(int i=4;i<=length;i++){
            max = 0;
            for(int j=1;j<=i/2;j++){
                int t = pro[j]*pro[i-j];
                if(max<t){
                    max = t;
                }
                pro[i] = t;
            }
        }
        return pro[length];
    }
}
