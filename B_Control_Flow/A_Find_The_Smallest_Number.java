package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;

public class A_Find_The_Smallest_Number {
    /*Viết chương trình tìm giá trị nhỏ nhất.
    Lấy 3 giá trị nguyên đầu vào từ người dùng và lưu trong n1, n2 và n3.
    Nếu n3 là số nhỏ nhất, in ra true.
    Nếu n3 không phải là số nhỏ nhất, in ra false. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        if((n3 < n2) && (n3 < n1)){
            System.out.println(true);
        }
        else System.out.println(false);
        sc.close();
    }
}
