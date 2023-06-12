package Java_Basic_And_OOP.D_Method;
import java.util.Scanner;

public class B_Sum_Of_Two_Number {
    /*Viết chương trình cộng hai số dấu phẩy động sử dụng phương thức */
    void sumOfTwo(double n1, double n2){
        System.out.println(n1 + n2);
    }
    public static void main(String[] args) {
        B_Sum_Of_Two_Number s = new B_Sum_Of_Two_Number();
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        s.sumOfTwo(n1, n2);
        sc.close();
    }
}
