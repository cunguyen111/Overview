package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class G_Upper_The_First_Character {
    /*Xây dựng chương trình viết hoa ký tự đầu tiên của chuỗi.  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String newStr = (str.substring(0, 1)).toUpperCase();
        String remainStr = str.substring(1, str.length());

        String result = newStr.concat(remainStr);

        System.out.println(result);
        sc.close();
    }
}
