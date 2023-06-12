package Java_Basic_And_OOP.I_Inheritance_In_Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quadrilateral s = new Quadrilateral();

        int[] sides = new int[4];

        for(int i = 0; i < sides.length; i++){
            sides[i] = sc.nextInt();
        }

        int perimeter = s.getPerimeter(sides);

        System.out.println(perimeter);

        s.displayInfo();

        sc.close();
    }
}
