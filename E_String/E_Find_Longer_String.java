package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class E_Find_Longer_String {
    /*Xây dựng chương trình tìm chuỗi dài hơn trong hai chuỗi nhập từ bàn phím */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int lengthStr1 = str1.length();
        //Note: With normal array, we use the attribute length, but with string, we use the length() method
        int lengthStr2 = str2.length();

        if(lengthStr1 > lengthStr2) System.out.println(str1);
        else System.out.println(str2);

        sc.close();
    }
}
