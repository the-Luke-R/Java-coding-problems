//PREMISE: sum two matrices and display the result in a new matrix

public class matrixSum {
    public static void main(String[] args) {
        int rows = 2, columns = 4;

        // Declaring the two matrices as multi-dimensional arrays
        int[][] MatrixA = { {1, 1, 1, 1}, {1, 1, 1, 1} };
        int[][] MatrixB = { {1, 50, 1, 1}, {2, 2, 4, -4} };

        int[][] matrixC = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }
        // Displaying the sum of the matrices
        System.out.println("matrixC of the given matrices is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixC[i][j] + "    ");
            }
            System.out.println();
        }
    }
}