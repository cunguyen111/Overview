package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class I_Sum_Of_Matrixes {
    //Sum of two matrices
    public static void main(String[] args) {
        //The matrices must be of the same order
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] matrixSum = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
