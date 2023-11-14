package hus.homework;

public class Matrices {
    public static void createRandomMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        createRandomMatrix(matrix);
        return matrix;
    }

    public static void print(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        return (rows1 == rows2) && (cols1 == cols2);
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        return (rows1 == rows2) && (cols1 == cols2);
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrices have different dimensions.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrices have different dimensions.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Cannot multiply matrices.");
            return null;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create matrices
        int[][] matrix1 = createRandomMatrix(2, 2);
        int[][] matrix2 = createRandomMatrix(2, 2);

        // Print matrices
        System.out.println("Matrix 1:");
        print(matrix1);
        System.out.println("Matrix 2:");
        print(matrix2);

        // Add matrices
        int[][] sum = add(matrix1, matrix2);
        System.out.println("Addition (Matrix 1 + Matrix 2):");
        print(sum);

        // Subtract matrices
        int[][] sub = subtract(matrix1, matrix2);
        System.out.println("Subtraction (Matrix 1 - Matrix 2):");
        print(sub);

        // Multiply matrices
        int[][] mul = multiply(matrix1, matrix2);
        System.out.println("Multiplication (Matrix 1 * Matrix 2):");
        print(mul);
    }
}
