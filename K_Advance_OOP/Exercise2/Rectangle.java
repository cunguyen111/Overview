package Java_Basic_And_OOP.K_Advance_OOP.Exercise2;

class Rectangle extends Polygon{
    private int length;
    private int width;

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }
}
