package offer.offer_5;

public class P205_Test_39_1 {

//    public int MoreThanHalfNum_Solution(int [] array) {
//        if(array == null)
//            return 0;
//        int num = array[0];
//        int count = 1;
//        for(int i = 1; i < array.length; i++){
//            if(num == array[i])
//                count++;
//            else{
//                if(count == 0){
//                    num = array[i];
//                    count++;
//                }
//                else{
//                    count--;
//                }
//            }
//        }
//        int times = 0;
//        for(int i = 0; i < array.length; i++){
//            if(num == array[i])
//                times++;
//        }
//        if(times*2 <= array.length)
//            return 0;
//        return num;
//    }

    int MoreThanHalf(int[] numbers, int length){
        int result = numbers[0];
        int time = 1;
        for (int i = 1;i<length;i++){
            if (time == 0){
                result = numbers[i];
                time = 1;
            }else if (numbers[i] == result){
                time++;
            }else time--;
        }
        return result;
    }
}
