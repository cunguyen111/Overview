package Java_Basic_And_OOP.H_Basic_OOP.Exercise1;

import java.util.Scanner;

class Person {
    String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = name1;
        person2.name = name2;

        System.out.println(person1.name);
        System.out.println(person2.name);
        sc.close();
    }
}
