package offer.offer_2;

public class P100_Test15_1 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(5));
    }

    public static int NumberOf1(int n){
        int count = 0;
       while (n!=0){
           ++count;
           n = (n-1)&n;
       }
       return count;
    }
}
