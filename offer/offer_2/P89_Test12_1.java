package offer.offer_2;

import java.util.ArrayList;

/**
 * 矩阵中的路径
 */
public class P89_Test12_1 {
    public static void main(String[] args) {
        String a ="ABCESFCSADEE";
        int row = 3;
        int col = 4;
        String b = "ABCCED";
        System.out.println(new P89_Test12_1().hasPath(a.toCharArray(), row, col, b.toCharArray()));
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix == null || rows < 1 || cols  < 1|| str == null)
            return false;
        boolean [] visited = new boolean[rows*cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                if(hashPathCore(matrix, rows, cols, i, j, str, 0, visited))
                    return true;
            }
        }
        return false;
    }
    boolean hashPathCore(char [] matrix,int rows,int cols,
                         int row,int col,char[]str,int pathLength,boolean []visited){
        if(pathLength == str.length)
            return true;
        boolean hashPath = false;
        if(row >= 0 && col >= 0 && row < rows && col < cols
                && !visited[row * cols+col] && str[pathLength] == matrix[row*cols+col]){
            ++pathLength;
            visited[row * cols+col] = true;
            hashPath =  hashPathCore(matrix,rows,cols,row,col-1,str,pathLength,visited)
                    || hashPathCore(matrix,rows,cols,row,col+1,str,pathLength,visited)
                    || hashPathCore(matrix,rows,cols,row+1,col,str,pathLength,visited)
                    || hashPathCore(matrix,rows,cols,row-1,col,str,pathLength,visited);
            if(!hashPath){
                System.out.println(matrix[row *rows + col] +" ");
                --pathLength;
                visited[row * cols+col] = false;
            }
        }
        return hashPath;

    }
//    boolean hashPath(char [][] matrix,int rows,int cols,int row,int col,char[]str,int pathLength,boolean [][]visited){
//        boolean hashPath = false;
//        if((row > 0) && (row < rows) && (col > 0) && (col < cols) && (str[pathLength] == matrix[row][col]) && !visited[row][col]){
//            ++pathLength;
//            visited[row][col]=true;
//            hashPath = hashPath(matrix,rows,cols,row,col-1,str,pathLength,visited)
//                    || hashPath(matrix,rows,cols,row,col+1,str,pathLength,visited)
//                    || hashPath(matrix,rows,cols,row+1,col,str,pathLength,visited)
//                    || hashPath(matrix,rows,cols,row-1,col,str,pathLength,visited);
//            if(!hashPath){
//                --pathLength;
//                visited[row][col] = false;
//            }
//        }
//        return hashPath;
//    }
}
