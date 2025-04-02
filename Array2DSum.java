package Arrays;

//Do sum 2D array

public class Array2DSum {
    public static int[][] createArray2D(final int ROW, final int COLUMN){
        int[][] matrix = new int[ROW][COLUMN];
        for(int row = 0; row < ROW; row++){
            for(int column = 0; column < COLUMN; column++){
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void displayArrayElements(int[][] matrix){

        final int COLUMN = matrix[0].length;
        for (int[] rows : matrix) {
            for (int column = 0; column < COLUMN; column++) {
                System.out.print(rows[column] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        final int ROW = 2;
        final int COLUMN = 3;
        int[][] matrix = createArray2D(ROW, COLUMN);

        displayArrayElements(matrix);

        System.out.println(doSumArray(matrix));
    }

    public static long doSumArray(int[][] matrix){
        long sum = 0;
        final int COLUMN = matrix[0].length;
        for(int[] rows : matrix){
            for(int column = 0; column < COLUMN; column++){
                sum+= rows[column];
            }
        }
        return sum;
    }
}
