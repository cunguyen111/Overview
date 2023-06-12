package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class F_Print_Character_Is_Not_Letter {
    /*Xây dựng chương trình in ra các ký tự không phải là chữ (các ký tự số, ký tự đặc biệt,…) */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        for(int i = 0; i < str1.length(); i++){
            if((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') || (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')) continue;
            else System.out.println(str1.charAt(i));
        }
        sc.close();
    }
}
