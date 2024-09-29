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
    void addMatrix();
}

class MatrixOperations implements Matrix {
    int[][] matrix1 = new int[M][N];
    int[][] matrix2 = new int[M][N];
    int[][] result = new int[M][N];
    
    @Override
    public void readMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
    }
    
    @Override
    public void displayMatrix() {
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    @Override
    public void addMatrix() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
}

public class Exp8PostLab1 {
    public static void main(String[] args) {
        MatrixOperations matOps = new MatrixOperations();
        matOps.readMatrix();
        matOps.addMatrix();
        matOps.displayMatrix();
    }
}
