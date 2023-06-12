package Java_Basic_And_OOP.K_Advance_OOP.Exercise4;
import java.util.Scanner;

public class Main {
    /*Xây dựng chương trình tính diện tích hình chữ nhật

Bước 1: 

Tạo lớp trừu tượng Polygon với phương thức trừu tượng calculateArea()
Tạo lớp Rectangle kế thừa từ Polygon, trong đó có hai trường length và breadth.
Tạo hàm khởi tạo cho hai trường nêu trên, sau đó viết triển khai của phương thức calculateArea() để tính diện tích và in ra màn hình
Bước 2: 

Trong chương trình chính, nhận vào từ bàn phím hai số nguyên length và breadth. 
Tạo một đối tượng của lớp Rectangle với hai trường là hai số nguyên trên. Sau đó gọi phương thức calculateArea(). */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int w = sc.nextInt();
        Rectangle r = new Rectangle(l, w);
        
        r.setLength(l);
        r.setWidth(w);
        
        r.calculateArea();
        
        int s = sc.nextInt();
        Square sq = new Square(s);

        sq.setSide(s);

        sq.calculateArea();
        sc.close();
    }
}
