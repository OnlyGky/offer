package offer.offer_5;

public class P240_Test_49_1 {

    public static void main(String[] args) {
        System.out.println( new P240_Test_49_1().GetUglyNumber_Solution(1500));
    }

    public int GetUglyNumber_Solution(int index) {
        if(index <= 0)
            return 0;
        int []ugly = new int[index];
        ugly[0] = 1;
        int nextUgly = 1;
        int index2=0, index3=0, index5=0;
        while(nextUgly < index){
            int min = Math.min(Math.min(ugly[index2]*2, ugly[index3]*3), ugly[index5]*5);
            ugly[nextUgly] = min;
            while(ugly[index2] *2 <= ugly[nextUgly])
                index2++;
            while(ugly[index3] *3 <= ugly[nextUgly])
                index3++;
            while(ugly[index5] *5 <= ugly[nextUgly])
                index5++;
            nextUgly++;
        }
        return ugly[nextUgly-1];
    }
}
