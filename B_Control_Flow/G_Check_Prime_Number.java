package Java_Basic_And_OOP.B_Control_Flow;
import java.util.Scanner;
import java.lang.Math;

public class G_Check_Prime_Number {
    /*Xây dựng chương trình kiểm tra một số có phải là số nguyên tố hay không. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        if(n < 2){
            flag = false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = false;
            }
        }
        
        if(flag == true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}
