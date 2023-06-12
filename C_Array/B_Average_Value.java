package Java_Basic_And_OOP.C_Array;
import java.util.Scanner;

public class B_Average_Value {
    /*Viết chương trình tính giá trị trung bình của các phần tử mảng. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[5];
        double average = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
            average += arr[i];
        }

        System.out.println(average/5);
        sc.close();
    }
}
