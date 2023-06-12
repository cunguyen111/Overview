package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;
import java.lang.Math;

public class H_Check_Armstrong_Number {
    /*Xây dựng chương trình kiểm tra một số có phải là số Armstrong hay không. Số Armstrong bậc 3 nếu tổng lập phương của các chữ số của nó bằng chính nó. Ví dụ 153 = 1^3 + 5^3 + 3^3 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sumOfEachNumber = 0;
        int newNumber = n;
        while(newNumber != 0){
            sumOfEachNumber = sumOfEachNumber + Math.pow((newNumber % 10), 3);
            newNumber /= 10;
        }
        if(sumOfEachNumber == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
