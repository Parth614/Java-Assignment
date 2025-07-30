public class TwoDArrayexample {
    public static void main(String[] args) {
        int[][] matrix = {
            {11, 32, 35},
            {42, 55, 67},
            {75, 86, 91}
        };

        System.out.println("2D Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
