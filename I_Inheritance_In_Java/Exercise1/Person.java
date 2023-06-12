package Java_Basic_And_OOP.I_Inheritance_In_Java.Exercise1;

public class Person {
    /*Viết một chương trình triển khai kế thừa phân cấp.

Lớp cha

Tạo lớp Person với phương thức displayInfo().
Bên trong phương thức, in I am a person..

Các lớp con

Dẫn xuất hai lớp Student và Employee từ lớp Person.
Bên trong lớp Student, ghi đè phương thức displayInfo() để in I am a student..
Bên trong lớp Employee, ghi đè phương thức displayInfo() để in I am an employee..
Lớp Main

Tạo các đối tượng của lớp Student và Employee và gọi phương thức displayInfo()
Output

I am a student.
I am an employee. */

    public void displayInfo(){
        System.out.println("I am a person.");
    }
}
