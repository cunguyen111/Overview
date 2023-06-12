package Java_Basic_And_OOP.H_Basic_OOP.Exercise6;

public class Rectangle {
    /*Xây dựng chương trình tính diện tích hình chữ nhật dựa theo công thức area = length * breadth.*/

    private int length;
    private int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public int getArea(){
        return length * breadth;
    }
}
