package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class C_Access_Character {
    /*Sử dụng các phương thức của chuỗi*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        String string3 = sc.nextLine();
        System.out.println(string1.equals(string2)); //Compare two strings
        System.out.println();
        System.out.println(string1.concat(string2)); //Concatenate two strings
        System.out.println();
        System.out.println(string1.replace('H', 'L')); //Replace character in string
        System.out.println();
        System.out.println(string1.replace(string1, string3));
        sc.close();
    }
}
