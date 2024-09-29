/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP8 : Interface demonstrating the concept of multiple inheritance
*/

import java.util.Scanner;

interface Matrix {
    int M = 2, N = 2;
    void readMatrix();
    void displayMatrix();
    void sum_Diagonal_Matrix();
}

class DiagonalMatrixOperations implements Matrix {
    int[][] matrix = new int[M][N];
    
    @Override
    public void readMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the Matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    @Override
    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    @Override
    public void sum_Diagonal_Matrix() {
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += matrix[i][i];  // Summing diagonal elements
        }
        System.out.println("Sum of Diagonal Elements: " + sum);
    }
}

public class Exp8PostLab2 {
    public static void main(String[] args) {
        DiagonalMatrixOperations diagOps = new DiagonalMatrixOperations();
        diagOps.readMatrix();
        diagOps.displayMatrix();
        diagOps.sum_Diagonal_Matrix();
    }
}

