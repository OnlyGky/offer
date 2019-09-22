package offer.offer_2;

/**
 * 机器人的运动范围
 */
public class P92_Test13_1 {

    public static void main(String[] args) {
        System.out.println(new P92_Test13_1().movingCount(3,3,18));
    }

    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visited = new boolean[rows][cols];
        return moveCountCore(threshold, rows, cols, 0, 0, visited);
    }
    int moveCountCore(int k,int rows,int cols,int row,int col,boolean [][]visited){
        int count =0;

        if(ifok(k, rows, cols, row, col, visited)){
            visited[row][col] = true;
            count = 1 + moveCountCore(k, rows, cols, row -1, col, visited)
                    + moveCountCore(k, rows, cols, row + 1, col, visited)
                    + moveCountCore(k, rows, cols, row , col - 1, visited)
                    + moveCountCore(k, rows, cols, row , col + 1, visited);
            System.out.println(count);
        }
        return count;
    }
    public boolean ifok(int k,int rows,int cols,int row,int col,boolean [][]visited){
        if(row >= 0 && row < rows && col >= 0 && col < cols && getSum(row) + getSum(col) <= k
                && !visited[row][col])
            return true;
        return false;
    }
    private int getSum(int row) {
        int sum = 0;
        while(row>0){
            sum+=row%10;
            row/=10;
        }
        return sum;
    }
//    int moveCountCore(int k,int rows,int cols,int row,int col,boolean [][]visite){
//        int count =0;
//        if(check(k,rows,cols,row,col,visite)){
//            visite[row][col] = true;
//            count = 1+moveCountCore(k,rows,cols,row-1,col,visite)+
//                    moveCountCore(k,rows,cols,row+1,col,visite)+
//                    moveCountCore(k,rows,cols,row,col-1,visite)+
//                    moveCountCore(k,rows,cols,row,col+1,visite);
//        }
//        return count;
//    }
//    public boolean check(int k,int rows,int cols,int row,int col,boolean [][]visited){
//        if(row>0 && row<rows && col>0 && col<cols && getSum(row)+getSum(col)<=k && !visited[row][col]){
//            return true;
//
//        }
//        return false;
//    }
//
//    private int getSum(int row) {
//        int sum = 0;
//        while(row>0){
//            sum+=row%10;
//            row/=10;
//        }
//        return sum;
//    }
}
