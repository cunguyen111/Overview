package Java_Basic_And_OOP.H_Basic_OOP.Exercise3_Access_Using_Getter_Setter;

public class Main {
    public static void main(String[] args) {
        Person s = new Person("HPN Chanel", 20);

        s.displayInformation();

        s.setName("HPN"); //Change the name

        s.displayInformation();
    }
}
