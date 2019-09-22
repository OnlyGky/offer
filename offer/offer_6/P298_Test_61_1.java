package offer.offer_6;

import java.util.Arrays;

public class P298_Test_61_1 {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length <1)
            return false;
        Arrays.sort(numbers);
        int zero = 0;
        int gap = 0;
        while(numbers[zero]==0)
            zero++;

        for(int i = numbers.length-1; i > zero;i--){
            if(numbers[i] ==numbers[i-1])
                return false;
            if(numbers[i] -numbers[i-1] > 1)
                gap+=(numbers[i] -numbers[i-1]-1);
        }
        if(zero>=gap)
            return true;
        return false;

    }

    boolean isContinous(int[] number, int length){
        if (number == null || length < 1)
            return false;
        Arrays.sort(number);
        int numberZero = 0;
        int numberGap = 0;
        for (int i = 0; i < number.length && number[i] == 0; i++)
            numberZero++;
        int small = numberZero;
        int big = small + 1;
        while (big < length){
            if (number[small] == number[big])
                return false;
            numberGap += number[big] - number[small] -1;
            small = big;
            ++ big;
        }
        return (numberGap > numberZero) ? false : true;
    }
}
