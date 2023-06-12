package Java_Basic_And_OOP.H_Basic_OOP.Exercise2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(0);

        int point = sc.nextInt();
        s.score = point;

        s.checkScore();

        sc.close();
    }
}
