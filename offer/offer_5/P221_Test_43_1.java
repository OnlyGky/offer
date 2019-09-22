package offer.offer_5;
//1-n中整数出现的次数

/**
 * https://www.cnblogs.com/xuanxufeng/p/6854105.html
 */

public class P221_Test_43_1 {

    public static int countDigitOne(int n){

        int one = 0;
        for (long m =1;m<=n;m*=10){ //m*=10 判断的是个十百千
            one +=(n/m + 8) / 10 * m +(n/m % 10 == 1 ? n%m + 1 :0); //当 n=12时 个位为 2 +0 十位为 0 + 3（10 11 12）
        }
        return one;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne(12));
    }
}
