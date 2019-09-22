package offer.offer_2;

public class P44_Test4_1 {

    public boolean Find(int target, int [][] array) {

        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0){
            if (target == array[row][col]) {
                return true;
            }
            if (target > array[row][col])
                row++;
            else col--;
        }
        return false;
    }
}
