package Java_Basic_And_OOP.H_Basic_OOP.Exercise8;

public class Coordinate {
    /*Xây dựng lớp Coordinate với hai trường số nguyên x và y để lưu hoành độ và tung độ
    Tạo một hàm khởi tạo để khởi tạo giá trị hai trường trên bằng từ khoá this

    Trong chương trình chính, nhận vào 4 số nguyên x1 và y1, x2 và y2 lần lượt là các toạ độ của hai đối tượng c1 và c2
    Trừ tương ứng toạ độ của hai đối tượng và in ra màn hình
 */
    public int x; //x-coordinate
    public int y; //y-coordinate

    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}
