package Java_Basic_And_OOP.A_Introduction_To_Java;

import java.util.Scanner;
public class E_Convert_From_C_To_F {
    /*Chuyển đổi độ C thành độ F
Hãy viết một chương trình chuyển đổi độ C sang độ F với đầu vào là độ C được nhập từ bàn phím.
Công thức chuyển đổi độ C sang độ F là
fahrenheit = (celsius * 1.8) + 32
Các bước thực hiện như sau:
Lấy nhiệt độ tính theo độ C từ người dùng và lưu nó trong biến celsius.
Chuyển đổi nhiệt độ sang độ F bằng công thức trên và lưu nó trong biến fahrenheit.
In ra màn hình giá trị nhiệt độ theo độ F sau khi đã chuyển đổi.
Input 
35.5
Output
95.9 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double celsius = sc.nextDouble();

    double fahrenheit = (celsius * 1.8) + 32;

    System.out.println(fahrenheit);
    sc.close();
}
}
