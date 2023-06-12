package Java_Basic_And_OOP.H_Basic_OOP.Exercise8;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    /*Trong chương trình chính, nhận vào 4 số nguyên x1 và y1, x2 và y2 lần lượt là các toạ độ của hai đối tượng c1 và c2
    Trừ tương ứng toạ độ của hai đối tượng và in ra màn hình */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Coordinate c1 = new Coordinate(x1, y1);
        Coordinate c2 = new Coordinate(x2, y2);

        c1.x = x1;
        c1.y = y1;
        c2.x = x2;
        c2.y = y2;

        int minusXCoordinate = Math.abs(c2.x - c1.x);
        int minusYCoordinate = Math.abs(c2.y - c1.y);

        System.out.println(minusXCoordinate);
        System.out.println(minusYCoordinate);

        sc.close();
    }
}
