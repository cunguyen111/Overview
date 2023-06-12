package Java_Basic_And_OOP.A_Introduction_To_Java;

import java.util.Scanner;

public class D_InputJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Notes: System.in
        int number = sc.nextInt();
        
        System.out.println("Number: " + number);
        sc.close(); //You should write this line into your code
    }
}
