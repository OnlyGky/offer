package offer.offer_2;

/**
 *f(n)=f(n-1)+f(n-2)
 */
public class P74_Test10_1 {
    public static void main(String[] args) {
        System.out.println(new P74_Test10_1().Fibonacci(4));
    }
    public int Fibonacci(int n) {
        if(n < 2)
            return n;
        int fibOne = 1;
        int fibTwo = 0;
        int f = 0;
        for(int i = 2; i <= n; i++){
            f = fibOne + fibTwo;
            fibTwo = fibOne;
            fibOne = f;
        }
        return f;
    }
}
