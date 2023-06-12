package Java_Basic_And_OOP.A_Introduction_To_Java;

public class C_Distribute_Pen {
    /* Viết chương trình chia N cái bút cho M học sinh.

Giả sử bạn phải chia đều 14 cái bút cho 3 học sinh.

Hỏi mỗi học sinh sẽ nhận được bao nhiêu cái bút nếu phải chia đều số bút đó?

Và còn lại bao nhiêu cái bút còn thừa lại?*/
    public static void main(String[] args) {
        int penNumber = 14;
        int student = 3;
        int penRemain = penNumber % student;

        int necessaryPen = penNumber / student;

        System.out.println(necessaryPen);
        System.out.println(penRemain);
    }
}
