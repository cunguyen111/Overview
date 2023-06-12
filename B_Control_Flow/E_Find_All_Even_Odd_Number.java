package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;

public class E_Find_All_Even_Odd_Number {
    /*Viết chương trình tìm các số chẵn và số lẻ trong khoảng từ 1 đến 10. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Odd Number");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Even Number");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
        sc.close();
    }
}
