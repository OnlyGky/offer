package offer.offer_4;

import java.util.ArrayList;

public class P161_Test29_1 {


    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int columns = matrix[0].length;
        int row = matrix.length;
        Print(matrix, columns, row);
        return list;
    }
    void  Print(int[][]numbers,int columns,int rows){
        if(numbers == null||columns<0 ||rows<0){
            return;
        }
        int start = 0;
        while (columns > start*2 && rows >start *2) {
            PrintMatrixCircle(numbers, columns, rows, start);
            ++start;
        }
    }
    void PrintMatrixCircle(int [][]numbers,int columns,int rows,int start){
        int endx = columns-1-start;
        int endy = rows-1-start;
        for(int i = start;i<=endx;i++){
            int number = numbers[start][i];
            list.add(number);
        }
        if(start<endy){
            for(int i = start+1;i<=endy;i++){
                int number = numbers[i][endx];
                list.add(number);
            }
        }
        if(start<endx && start <endy){
            for (int i = endx - 1;i >= start;--i){
                int number = numbers[endy][i];
                list.add(number);
            }
        }
        if(start<endx && start <endy) {
            for(int i = endy-1;i>=start+1;--i){
                int number = numbers[i][start];
                list.add(number);
            }
        }
    }
}
