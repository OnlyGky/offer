package offer.offer_3;

public class P129_Test21_1 {

    public void reOrderArray(int [] array) {
        if(array == null)
            return;
        for(int i = 0; i <array.length; i++){
            int flag = 0;
            if(array[i] % 2 == 0){
                for(int j = i+1; j <array.length;j++){
                    if(array[j]%2==1){
                        int temp = array[j];
                        for(int t = j; t > i; t--){
                            array[t] = array[t-1];
//                            System.out.println(array[t+1]);
                        }
                        array[i] = temp;
                        flag =1;
                        break;
                    }
                }
            }

        }
    }


    void RecorderOddEven(int []pData){
        if(pData == null )
            return;
        int length = pData.length;
        if(length == 0)
            return;
        int start = 0;
        int end = length-1;
        while(start<end){
            while (start<end && (pData[start]&1)!=0)
                start++;
            while (start<end && (pData[end]&1)==0)
                end--;
            if(start<end){
                int temp = pData[start];
                pData[start] = pData[end];
                pData[end]= temp;
            }
        }

    }
}
