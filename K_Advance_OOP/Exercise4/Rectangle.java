package Java_Basic_And_OOP.K_Advance_OOP.Exercise4;

public class Rectangle {
    private int length;
    private int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void calculateArea(){
        int area = length * width;
        System.out.println(area);
    }
}
