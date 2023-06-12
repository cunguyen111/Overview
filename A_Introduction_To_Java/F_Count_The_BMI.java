package Java_Basic_And_OOP.A_Introduction_To_Java;

import java.util.Scanner;
public class F_Count_The_BMI {
    /*Xây dựng chương trình tính chỉ số BMI của một người, biết rằng công thức tính BMI được tính như sau:
    BMI = weight / (height * height)

    Các bước thực hiện:

    Nhận các biến kiểu double từ bàn phím: weight là cân nặng của người dùng, height là chiều cao của người dùng
    Sử dụng công thức tính chỉ số BMI và in ra màn hình 
    Input

    58.5
    1.81
    Output

    17.856597783950427 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double BMI = weight / (height * height);

        System.out.println(BMI);
        sc.close();
    }
}
