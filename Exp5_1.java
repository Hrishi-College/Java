/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP5 : Write a program in java to perform 
        (i) Matrix Addition 
        (ii) Count frequency 
           of a given letter in a String.
*/
import java.util.Scanner;

class Exp5_1 {
    public static void main(String[] args) {
        int i, j;
        int[][] set1 = new int[3][3];
        int[][] set2 = new int[3][3];
        int[][] add = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of the first matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                set1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values of the second matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                set2[i][j] = sc.nextInt();
            }
        }

        // Adding the matrices
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                add[i][j] = set1[i][j] + set2[i][j];
            }
        }

        System.out.println("The resultant matrix after addition is:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}

