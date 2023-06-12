package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;

public class F_Check_Leap_Year {
    /*Xây dựng chương trình kiểm tra một năm là năm nhuận hay không. Năm nhuận là năm chia hết cho 4 trừ các năm tròn thế kỉ (kết thúc bằng 00). Năm tròn thế kỉ là năm nhuận nếu nó chia hết cho 400. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap Year");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
