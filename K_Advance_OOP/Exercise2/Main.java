package Java_Basic_And_OOP.K_Advance_OOP.Exercise2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int s = sc.nextInt();
        Rectangle r = new Rectangle();
        r.setLength(l);
        r.setWidth(w);

        int areaRectangle = r.getArea();
        System.out.println(areaRectangle);
        

        Square sq = new Square();
        sq.setSide(s);
        int areaSquare = sq.getArea();
        System.out.println(areaSquare);
        
        sc.close();
    }
}
