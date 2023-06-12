package Java_Basic_And_OOP.D_Method;
import java.util.Scanner;

public class G_Dividend {
    /*Xây dựng chương trình kiểm tra một số có phải là một số tự chia hay không. Số tự chia là số chia hết cho các chữ số của nó. Ví dụ số 128 chia hết cho 1, 2 và 8 là các chữ số của nó */
    boolean checkDividend(int n){
        boolean flag = true;
        int newNumber = n;
        int remainder;

        while(newNumber != 0){
            remainder = newNumber % 10;
            if(n % remainder != 0) flag = false;
            newNumber /= 10;
        }
        return flag;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        G_Dividend s = new G_Dividend();

        boolean result = s.checkDividend(n);
        if(result == true) System.out.println("Self Dividing Number");
        else System.out.println("Not a Self Dividing Number");
        sc.close();
    }
}
