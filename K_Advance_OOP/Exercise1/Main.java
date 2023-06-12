package Java_Basic_And_OOP.K_Advance_OOP.Exercise1;

abstract class Polygon{
    //abstract method
    abstract void getArea();

    //non-abstract method
    public void printSides(){
        System.out.println("Print sides of Polygon.");
    }
}

class Rectangle extends Polygon{
    void getArea(){
        
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.getArea();
        s.printSides();
    }
}
