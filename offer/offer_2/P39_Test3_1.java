package offer.offer_2;

/**
 * 一个不重复的数字排好序的话是不会再变换位置的
 */
public class P39_Test3_1 {
    public boolean duplicate(int number[],int length,int [] duplication) {
        if(number == null || length < 1)
            return false;
        for(int i = 0 ; i < length; i++){
            while(number[i]!=i){
                if(number[i] == number[number[i]]){
                    duplication[0] = number[i];
                    return true;
                }
                int temp = number[i];
                number[i] = number[temp];
                number[temp] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,0,6,5,4};
        for(int i=0;i<7;i++){
            while(a[i]!=i){
                System.out.println(a[i]+" "+i);
                if(a[i]==a[a[i]]){
                    System.out.println(a[i]);
                    return;
                }
                int t = a[a[i]];
                a[a[i]] = a[i];
                a[i] = t;
            }
        }
    }
}
