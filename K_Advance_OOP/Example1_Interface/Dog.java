package Java_Basic_And_OOP.K_Advance_OOP.Example1_Interface;

class Dog implements Animal{  //Lớp Dog triển khai interface Animal
    public void play(){
        System.out.println("I can play football");
    }

    public void makeSound(){
        System.out.println("Woof Woof");
    }

    public void eat(){
        System.out.println("I can eat meat");
    } 
}
