package Java_Basic_And_OOP.L_Completed_OOP;
//replace ___ with your code
class Animal {

    // constructor of the Animal class
    Animal(String type){
        System.out.println(type);
    }
}

//create the Cat class inheriting from Animal
class Cat extends Animal {

    // constructor of the Cat class
    Cat() {

        // use super() to call the constructor of the superclass Animal with argument "Mammal"
        super("Mammal"); //you can take argument in super() if base class take argument

        // print "Constructing Cat"
        System.out.println("Constructing Cat");
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}
