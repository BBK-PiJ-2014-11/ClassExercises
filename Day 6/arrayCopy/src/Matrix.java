/**
 * Created by Ehshan on 05/11/2014.
 */
public class Matrix {
    public int[][] matrix;

    public Matrix(int row, int column){
         matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    public void setElement(int row, int column, int value ){
        if (row >= matrix.length || column >= matrix[0].length ) {
            return;
        } else {
            matrix[row][column] = value;
        }

    }

    public void setRow(int row , String numbers){
        String[] values = numbers.split(",");

    }
}