package Java_Basic_And_OOP.H_Basic_OOP.Exercise4_Area_Of_Right_Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int height = sc.nextInt();

        Triangle s = new Triangle(base, height);
        double area = s.getArea();

        System.out.println(area);

        sc.close();
    }
}
