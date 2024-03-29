package offer.offer_3;

/**
 * 数的n次方
 */
public class P110_Test16_1 {

    /**
     * 1.全面考察指数的正负、底数是否为零等情况。
     * 2.写出指数的二进制表达，例如13表达为二进制1101。
     * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
     * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
     */
    public double Power(double base, int n) {
        double res = 1,curr = base;
        int exponent;
        if(n>0){
            exponent = n;
        }else if(n<0){
            if(base==0)
                throw new RuntimeException("分母不能为0");
            exponent = -n;
        }else{// n==0
            return 1;// 0的0次方
        }
        while(exponent!=0){
            if((exponent&1)==1)
                res*=curr;
            curr*=curr;// 翻倍
            exponent>>=1;// 右移一位
        }
        return n>=0?res:(1/res);
    }
    //输入3.1 2报错
    double PowerWithUnsignedExponet(double base,int exponet){
        if(exponet==0){
            return 1;
        }
        if(exponet==1){
            return base;
        }
        double result = PowerWithUnsignedExponet(base,exponet>>1);//求出该平方的二分之一
        result *=result;//再乘回去
        if((exponet & 0x1)  ==1){
            result*=base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P110_Test16_1().PowerWithUnsignedExponet(3.1,2));
    }
}
