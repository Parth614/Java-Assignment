public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = {
            {11, 23},
            {12, 45}
        };
        int[][] B = {
            {15, 16},
            {17, 19}
        };

        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Matrix Addition:");
        printMatrix(sum);
        int[][] product = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < cols; k++)
                    product[i][j] += A[i][k] * B[k][j];

        System.out.println("\nMatrix Multiplication:");
        printMatrix(product);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
