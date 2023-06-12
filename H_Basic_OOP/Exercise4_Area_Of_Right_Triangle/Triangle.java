package Java_Basic_And_OOP.H_Basic_OOP.Exercise4_Area_Of_Right_Triangle;

public class Triangle {
    /*Viết chương trình tính diện tích tam giác vuông.

    Công thức tính diện tích tam giác vuông là:

    Area = 1 / 2 (base * height) */
    private int base;
    private int height;

    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public void setBase(int base){
        this.base = base;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double getArea(){
        return (base * height) / (double)2;
    }

    public int getBase(){
        return base;
    }

    public int getHeight(){
        return height;
    }
}
