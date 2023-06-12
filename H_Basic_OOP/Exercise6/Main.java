package Java_Basic_And_OOP.H_Basic_OOP.Exercise6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Rectangle s = new Rectangle(length, breadth);

        int area = s.getArea();

        System.out.println(area);

        sc.close();
    }
}
