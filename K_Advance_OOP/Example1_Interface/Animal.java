package Java_Basic_And_OOP.K_Advance_OOP.Example1_Interface;

interface Animal {
    abstract void play();
    abstract void makeSound();
    abstract void eat();

    //Tất cả các phương thức trừu tượng được xây dựng trong interface phải được các lớp triển khai, vì ta không thể tạo đối tượng của các phương thức trừu tượng
}
