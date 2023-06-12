package Java_Basic_And_OOP.D_Method;
import java.util.Scanner;
import java.lang.Math;

public class F_Print_Prime_Number_In_Range {
    /*Xây dựng chương trình tìm tất cả các số nguyên tố giữa hai số nguyên cho trước */
    boolean checkPrime(int n){
        boolean flag = true;
        if(n < 2) flag = false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) flag = false;
        }

        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        F_Print_Prime_Number_In_Range s = new F_Print_Prime_Number_In_Range();

        for(int i = x; i <= y; i++){
            boolean result = s.checkPrime(i);
            if(result == true){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
