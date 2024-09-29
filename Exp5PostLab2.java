/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP5 : Matrix Addition and Count Frequency of a Letter in String
*/
public class Exp5PostLab2 {

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];  // Adding primary diagonal elements
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}

