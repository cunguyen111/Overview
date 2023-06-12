package Java_Basic_And_OOP.E_String;
import java.util.Scanner;
import java.lang.Math;

public class M_Print_Prime_Number_From_50_To_100 {
    //Print prime numbers from 50 to 100

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

        M_Print_Prime_Number_From_50_To_100 s = new M_Print_Prime_Number_From_50_To_100();

        for(int i = 50; i <= 100; i++){
            boolean result = s.checkPrime(i);

            if(result == true) System.out.print(i + " ");
        }

        sc.close();
    }
}
