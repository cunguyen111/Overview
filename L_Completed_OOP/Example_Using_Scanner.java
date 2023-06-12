package Java_Basic_And_OOP.L_Completed_OOP;
import java.util.Scanner;

public class Example_Using_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.next();

        System.out.println("With using nextLine(): " + name1);
        System.out.println("With using next(): " + name2);

        sc.close();
    }
}
