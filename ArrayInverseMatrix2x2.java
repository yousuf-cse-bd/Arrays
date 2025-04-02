package Arrays;

import java.util.Scanner;

public class ArrayInverseMatrix2x2 {
    static Scanner scanner = new Scanner(System.in);

    public static int[][] createMatrix(final int ROW, final int COLUMN){
        int[][] matrix = new int[ROW][COLUMN];
        System.out.println("Enter elements for 2x2 matrix");
        for(int row = 0; row < ROW; row++){
            for(int column = 0; column < COLUMN; column++){
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix){
        for(int[] rows : matrix){
            for(int column : rows){
                System.out.print(column+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final int ROW = 2;
        final int COLUMN = 2;
        int[][] matrix = createMatrix(ROW, COLUMN);

        System.out.println("User matrix:");
        showMatrix(matrix);

        int determiner = diagonal1(matrix) - diagonal2(matrix);

        if(determiner == 0){
            System.out.println("\n\tInverse NOT possible!!!");
        }
        else{
            int[][] inverseMatrix = doInverseMatrix(matrix, ROW, COLUMN);
            System.out.println("\nInverse matrix:");
            System.out.println("(1/"+determiner+")");

            showMatrix(inverseMatrix);
        }

    }

    public static int diagonal1(int[][] matrix){
        return matrix[0][0] * matrix[matrix.length-1][matrix[0].length-1];
    }
    public static int diagonal2(int[][] matrix){
        return matrix[0][1] * matrix[1][0];
    }

    public static int[][] doInverseMatrix(int[][] matrix, final int ROW, final int COLUMN){
        int[][] inverseMatrix = new int[ROW][COLUMN];
        for(int row = 0; row < ROW; row++){
            System.arraycopy(matrix[row], 0, inverseMatrix[row], 0, COLUMN);
        }
        inverseMatrix[0][0] = inverseMatrix[0][0] ^ inverseMatrix[1][1];
        inverseMatrix[1][1] = inverseMatrix[0][0] ^ inverseMatrix[1][1];
        inverseMatrix[0][0] = inverseMatrix[0][0] ^ inverseMatrix[1][1];

        inverseMatrix[0][1] = inverseMatrix[0][1]*(-1);
        inverseMatrix[1][0] = inverseMatrix[1][0]*(-1);

        return inverseMatrix;
    }
}
