package Java_Basic_And_OOP.I_Inheritance_In_Java;

public class Polygon {
    void displayInfo(){
        System.out.println("A polygon is a two dimensional shape with straight lines.");
    }

    int getPerimeter(int[] sides){
        int perimeter = 0;

        for(int side : sides){
            perimeter += side;
        }

        return perimeter;
    }
}
