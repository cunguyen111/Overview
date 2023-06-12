package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;

public class C_Factorial {
    /*Viết chương trình tính giai thừa của một số nguyên do người dùng nhập vào.
    Using while loop and for loop
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        //While loop
        // while(n >= 1){
        //     factorial *= n;
        //     n--;
        // }
        // System.out.println(factorial);
        // sc.close();

        //For loop
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        sc.close();
    }
}
