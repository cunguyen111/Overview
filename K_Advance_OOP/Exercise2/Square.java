package Java_Basic_And_OOP.K_Advance_OOP.Exercise2;

class Square extends Polygon{
    private int side;

    public void setSide(int side){
        this.side = side;
    }

    public int getArea(){
        return side * side;
    }
}
