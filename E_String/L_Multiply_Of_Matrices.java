package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class L_Multiply_Of_Matrices {
    //Matrix multiplication
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col1 = sc.nextInt();
        int col2 = sc.nextInt();

        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];

        int[][] matrixRel = new int[row1][col2];
        if(col1 != row2){
            System.out.println("Can't Solve!!!");
        }
        else{
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col1; j++){
                    matrix1[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < row2; i++){
                for(int j = 0; j < col2; j++){
                    matrix2[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                    for(int l = 0; l < col1; l++){
                        matrixRel[i][j] = matrixRel[i][j] + matrix1[i][l]*matrix2[l][j];
                    }
                }
            }
            /*Giải thích đoạn code:
             * for(int i = 0; i < row1; i++): chúng ta sử dụng vòng lặp này để lặp qua các hàng của ma trận matrixRel
             * for(int j = 0; j < col2; j++): chúng ta sử dụng vòng lặp này để lặp qua các cột của ma trận matrixRel
             * for(int l = 0; l < col1; l++): chúng ta sử dụng vòng lặp này để lặp qua các phần tử trong cùng một hàng của ma trận đầu tiên và cột của ma trận thứ hai. Biến l là chỉ số cột của ma trận matrix1 và chỉ số hàng của ma trận matrix2
             */
            
            System.out.println();
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                    System.out.print(matrixRel[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
