package Java_Basic_And_OOP.H_Basic_OOP.Exercise2;

public class Student {
    /*Viết chương trình xếp loại sinh viên dựa trên điểm thi.

    Tiêu chí đánh giá: Nếu điểm

    lớn hơn hoặc bằng 90, điểm là A.
    lớn hơn hoặc bằng 80, điểm là B.
    dưới 80, điểm là C. */

    int score;

    Student(int score){
        this.score = score;
    }

    void checkScore(){
        if(score >= 90) System.out.println("A");
        else if(score >= 80) System.out.println("B");
        else System.out.println("C");
    }
    
}
