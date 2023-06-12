package Java_Basic_And_OOP.D_Method;
import java.util.Scanner;
import java.lang.Math;

public class D_Reverse_Number {
    /*Xây dựng chương trình đảo ngược một số sử dụng phương thức */
    double reverseNumber(int n){
        int newNumber1 = n;
        double count = -1;
        double reverse = 0;
        int newNumber2 = n;

        while(newNumber1 != 0){
            count++;
            newNumber1 /= 10;
        }

        while(newNumber2 != 0){
            reverse = reverse + ((newNumber2 % 10) * Math.pow(10, count));
            count--;
            newNumber2 /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        D_Reverse_Number s = new D_Reverse_Number();
        System.out.println((int)s.reverseNumber(n));
        sc.close();
    }
}
