/* 
 * This code is created by Aiko Heart Agapay.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Matrices_Addition_Multiplication {

    // Method to perform matrix addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
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

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
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

    // Method to input matrix elements from user
    public static int[][] inputMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first matrix
        System.out.print("Enter the no. of Rows and Columns of the 1st matrix: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = inputMatrix(scanner, rows1, cols1);

        // Input for second matrix
        System.out.print("Enter the no. of Rows and Columns of the 2nd matrix: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = inputMatrix(scanner, rows2, cols2);

        // Matrix addition
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] additionResult = addMatrices(matrix1, matrix2);
            System.out.println("Addition of the matrices:");
            System.out.println(Arrays.deepToString(additionResult).replace("],", "]\n"));
        } else {
            System.out.println("Matrix addition not possible: Dimensions do not match.");
        }

        // Matrix multiplication
        if (cols1 == rows2) {
            int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
            System.out.println("Multiplication of the matrices:");
            System.out.println(Arrays.deepToString(multiplicationResult).replace("],", "]\n"));
        } else {
            System.out.println("Matrix multiplication not possible: Columns of first matrix must equal rows of second matrix.");
        }

        scanner.close();
    }
}
