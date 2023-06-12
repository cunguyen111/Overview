package Java_Basic_And_OOP.L_Completed_OOP.Exercise1;

class Student extends Person{
    String info = "Student";

    String superGetInfo(){
        return super.info; //Ta không thể truy cập thuộc tính lớp cha bằng từ khóa super khi thuộc tính ở lớp cha được đặt ở phạm vi private
    }
}
