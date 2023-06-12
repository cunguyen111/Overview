package Java_Basic_And_OOP.D_Method;
import java.util.Scanner;

public class C_Project_Count_The_Score {
    /*Giả sử bạn là trợ giảng tại một trường Đại học và bạn cần chấm điểm cho sinh viên dựa trên điểm trung bình.

Điểm số mà sinh viên đạt được trong các môn học khác nhau được lưu trong một mảng
Công việc của bạn trước tiên là tính điểm trung bình. Và dựa trên điểm trung bình, bạn quy đổi điểm của sinh viên.

Quy tắc quy đổi điểm:

Điểm A nếu điểm trung bình bằng hoặc lớn hơn 80
Điểm B nếu điểm trung bình bằng hoặc lớn hơn 60 và nhỏ hơn 80
Điểm C nếu điểm trung bình bằng hoặc lớn hơn 50 và nhỏ hơn 60
Điểm F nếu điểm trung bình nhỏ hơn 50 */

    double computeAverage(int[] arr){ //Method for compute the average score
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    String convertScore(double n){ //Method for convert score
        if(n >= 80) return "A";
        else if(n >= 60 && n < 80) return "B";
        else if(n >= 50 && n < 60) return "C";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberSubject = sc.nextInt(); //input the number of subjects of this student
        int[] arr = new int[numberSubject];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        C_Project_Count_The_Score s = new C_Project_Count_The_Score();

        double average = s.computeAverage(arr);
        String result = s.convertScore(average);
        
        System.out.println("Average score: " + average);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
