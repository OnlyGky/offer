package offer.offer_6;

public class P304_Test_63_1 {
    int MaxDif(int[] number){
        if (number == null)
            return 0;
        int min = number[0];
        int maxDiff = number[1] - min;
        for (int i = 2; i< number.length; i++){
            if (number[i-1]< min)
                min = number[i-1];
            int currentDif = number[i] - min;
            if (currentDif > maxDiff)
                maxDiff = currentDif;
        }
        return maxDiff;
    }
}
