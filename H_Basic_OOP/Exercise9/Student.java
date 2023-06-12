package Java_Basic_And_OOP.H_Basic_OOP.Exercise9;

public class Student {
    /*Xây dựng lớp Student với một trường private là xâu ký tự name 
Tạo một phương thức public setName() nhận tham số là xâu ký tự, trong đó khởi tạo trường name cho lớp Student. Tạo một phương thức public khác là getName(), trong đó trả về trường name của lớp Student */

    private String name;

    Student(String name){
        this.name = name;
    }

    public void setName(String name){
        System.out.println("Setting Name");
        this.name = name;
    }

    public String getName(){
        System.out.println("Getting Name");
        return name;
    }
}
