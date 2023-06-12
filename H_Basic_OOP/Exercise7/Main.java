package Java_Basic_And_OOP.H_Basic_OOP.Exercise7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        ComplexNumber s1 = new ComplexNumber(n1, n2);

        ComplexNumber s2 = new ComplexNumber(n3, n4);

        s1.setReal(n1);
        s1.setImag(n2);
        s2.setReal(n3);
        s2.setImag(n4);
        double sumReal = s1.getReal() + s2.getReal();
        double sumImag = s1.getImag() + s2.getImag();

        System.out.println(sumReal + " + " + sumImag + "i");
        sc.close();
    }
}
