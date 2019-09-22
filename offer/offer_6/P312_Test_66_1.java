package offer.offer_6;

public class P312_Test_66_1 {


    public int[] multiply(int[] A) {
        if(A==null || A.length==0)
            return A;
        int[] B = new int[A.length];
        B[0] = 1;
        for(int i=1; i<A.length; i++){
            B[i] = A[i-1]*B[i-1];
        }
        int temp = 1;
        for(int i=B.length-1; i>=0; i--){
            B[i] = B[i]*temp;
            temp = temp*A[i];
        }
        return B;
    }
}
