package offer.offer_5;

public class P249_Test_51_1 {



    public int InversePairs(int [] array) {
        if(array==null||array.length<2)
            return 0;
        return MergeSort(array, 0, array.length-1);
    }
    public int MergeSort(int[] arr, int left, int right){
        //base case
        if(left==right)
            return 0;
        //
        int mid = left + ((right - left) >> 1);
        int leftRes = MergeSort(arr, left, mid); //左部分逆序对的数量
        int rightRes = MergeSort(arr, mid+1, right);//右部分逆序对的数量
        int mergeRes = Merge(arr, left, mid, right);//归并左右部分产生的逆序对数量
        return (leftRes + rightRes + mergeRes)%1000000007;
    }
    public int Merge(int[] arr, int left, int mid, int right){
        //create auxiliary arr
        int[] help = new int[right - left + 1];
        //create pointer
        int p1=left, p2=mid+1, i=0;
        //create res
        int res=0;
        //start merging
        while(p1 <= mid && p2 <=right){
            if(arr[p1] > arr[p2]){
                res += right - p2 + 1; //arr[p1] 比arr[p2]大的话,比它后面所有的数都大
                res = res%1000000007; //不加这句,对于大数组的案例就通过不了了; 本来我是加在return中的,后来发现报错才加在这里的
                help[i++] = arr[p1++];
            }
            else{
                help[i++] = arr[p2++];
            }
        }
        //ensure merging finished
        while(p1<=mid)
            help[i++] = arr[p1++];
        while(p2<=right)
            help[i++] = arr[p2++];
        //last step: help ==> arr
        for(int k=0; k<help.length; k++)
            arr[left++] = help[k];
        return res;
    }
}
