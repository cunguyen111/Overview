package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;

public class J_Calculator {
    /*Xây dựng chương trình tạo ra một máy tính sử dụng switch case
Nhận vào hai số thực là first và second, một xâu op
Xâu nhập vào chỉ nhận các giá trị “+”, “-“, “*” hoặc “/”. Dựa theo các giá trị này để tính toán phép tính tương ứng. Nếu không có các giá trị trên in ra Invalid Operator */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);

        double first = sc.nextDouble();
        double second = sc.nextDouble();

        switch(op){
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();
    }
}
