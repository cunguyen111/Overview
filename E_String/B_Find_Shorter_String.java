package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class B_Find_Shorter_String {
    /*Viết chương trình tìm chuỗi ngắn hơn trong hai chuỗi. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();

        int str1Length = string1.length();
        int str2Length = string2.length();

        if(str1Length < str2Length) System.out.println(string1);
        else System.out.println(string2);
        sc.close();
    }
}
