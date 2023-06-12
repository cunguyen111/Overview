package Java_Basic_And_OOP.K_Advance_OOP.Exercise4;

public class Square implements Polygon{
    private int side;

    Square(int side){
        this.side = side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public void calculateArea(){
        int area = side * side;
        System.out.println(area);
    }
}
