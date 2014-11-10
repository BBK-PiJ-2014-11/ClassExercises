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
        if (row >= matrix.length || values.length > matrix[0].length) {
            return;
        }else{
            int[] setRow = new int[values.length];
            for(int i =0; i<values.length; i++) {
                setRow[i] = Integer.parseInt(values[i]);
            }
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = setRow[i];
            }
        }
    }

    public void setColumn(int column , String numbers){
        String[] values = numbers.split(",");
        if (column >= matrix[0].length || values.length > matrix.length) {
            return;
        }else{
            int[] setColumn = new int[values.length];
            for(int i =0; i<values.length; i++) {
                setColumn[i] = Integer.parseInt(values[i]);
            }
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[column][i] = setColumn[i];
            }
        }
    }

    public String toString(){
        String values = "[ ";
        for (int i = 0; i < matrix.length; i++){ ;
            values += values + (matrix[i]+":");
            for (int j = 0; j < matrix[0].length; j++) {
                values += values + (matrix[j]+",");
            }
            values += values + "]";
        }
        return values;
    }

    public void prettyPrint() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j= 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}