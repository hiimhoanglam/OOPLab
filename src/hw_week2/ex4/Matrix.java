package hw_week2.ex4;

public class Matrix {
    public static void main(String[] args) {
        // Define matrices
        int[][] matrix1Int = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2Int = {{7, 8, 9}, {10, 11, 12}};
        double[][] matrix1Double = {{1.5, 2.5}, {3.5, 4.5}};
        double[][] matrix2Double = {{2.5, 3.5}, {4.5, 5.5}};

        // Test print method
        System.out.println("Printing int matrix1:");
        print(matrix1Int);
        System.out.println("Printing double matrix1:");
        print(matrix1Double);

        // Test add method
        int[][] resultAddInt = add(matrix1Int, matrix2Int);
        double[][] resultAddDouble = add(matrix1Double, matrix2Double);
        System.out.println("Result of adding int matrices:");
        print(resultAddInt);
        System.out.println("Result of adding double matrices:");
        print(resultAddDouble);

        // Test subtract method
        int[][] resultSubtractInt = subtract(matrix1Int, matrix2Int);
        double[][] resultSubtractDouble = subtract(matrix1Double, matrix2Double);
        System.out.println("Result of subtracting int matrices:");
        print(resultSubtractInt);
        System.out.println("Result of subtracting double matrices:");
        print(resultSubtractDouble);

        // Test multiply method
        matrix2Int = new int[][]{{7, 8}, {9, 10}, {11, 12}};
        int[][] resultMultiplyInt = multiply(matrix1Int, matrix2Int);
        double[][] resultMultiplyDouble = multiply(matrix1Double, matrix2Double);
        System.out.println("Result of multiplying int matrices:");
        print(resultMultiplyInt);
        System.out.println("Result of multiplying double matrices:");
        print(resultMultiplyDouble);
    }
    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                if (col != matrix[0].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                if (col != matrix[0].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static boolean notHaveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length;
    }
    public static boolean notHaveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length;
    }
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (notHaveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                matrix1[row][col] += matrix2[row][col];
            }

        }
        return matrix1;
    }
    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (notHaveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                matrix1[row][col] += matrix2[row][col];
            }
        }
        return matrix1;
    }
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (notHaveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                matrix1[row][col] -= matrix2[row][col];
            }

        }
        return matrix1;
    }
    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (notHaveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                matrix1[row][col] -= matrix2[row][col];
            }
        }
        return matrix1;
    }
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1[0].length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}
