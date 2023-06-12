package Java_Basic_And_OOP.H_Basic_OOP.Exercise9;
import java.util.Scanner;

public class Main {
    /*Trong chương trình chính, nhận vào từ bàn phím xâu ký tự là tên học sinh, sau đó tạo một đối tượng để lưu tên học sinh
    Gọi setName() để lưu tên học sinh và gọi getName() để in tên ra màn hình */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Student s = new Student(null);

        s.setName(name);

        System.out.println(s.getName());

        sc.close();
    }
}
