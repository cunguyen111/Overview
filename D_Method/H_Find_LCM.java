package Java_Basic_And_OOP.D_Method;
import java.util.Scanner;

public class H_Find_LCM {
    /*Xây dựng chương trình tìm bội chung nhỏ nhất (LCM) của hai số, là số nhỏ nhất chia hết cho cả 2 số đó. */
    int findLCM(int num1, int num2){
        int i;
        if(num1 > num2) i = num1;
        else i = num2;
        int result;
        while(true){
            if(i % num1 == 0 && i % num2 == 0){
                result = i;
                break;
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        H_Find_LCM s = new H_Find_LCM();

        System.out.println(s.findLCM(num1, num2));
        sc.close();
    }
}
