package offer.offer_6;

public class P307_Test_64_1 {
    public int Sum_Solution(int n){
        int temp = n;
        boolean flag = (n > 1) && (temp = temp + Sum_Solution(n-1))>0;
        return temp;
    }
    public int Sum_Solutionone(int n) {
        return (n+(int)Math.pow(n,2))>>1;
    }
}
