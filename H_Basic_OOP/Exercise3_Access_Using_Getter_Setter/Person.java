package Java_Basic_And_OOP.H_Basic_OOP.Exercise3_Access_Using_Getter_Setter;

public class Person {
    /*
     * Viết chương trình truy cập một trường private bằng các phương thức getter và
     * setter.
     */
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
