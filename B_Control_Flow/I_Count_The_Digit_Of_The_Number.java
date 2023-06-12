package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;

public class I_Count_The_Digit_Of_The_Number {
    /*Xây dựng chương trình đếm số chữ số của một số nguyên nhập vào từ bàn phím */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countDigit = 0;

        int newNumber = n;
        while(newNumber != 0){
            countDigit++;
            newNumber /= 10;
        }
        System.out.println(countDigit);
        sc.close();
    }
}
