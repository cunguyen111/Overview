package Java_Basic_And_OOP.K_Advance_OOP.Exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition a = new Addition();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println("Sum of two strings: " + a.add(s1, s2));

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Sum of two and three integers: " + a.add(num2, num3) + " and " + a.add(num1, num2, num3));

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.println("Sum of two double nums: " + a.add(n1, n2));
        sc.close();
    }
}
