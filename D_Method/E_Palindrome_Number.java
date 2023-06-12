package Java_Basic_And_OOP.D_Method;
import java.util.Scanner;

public class E_Palindrome_Number {
    /*Xây dựng chương trình kiểm tra một số có phải là số Palindrome hay không. Số Palindrome là số mà đảo ngược của nó là chính nó. Ví dụ 1001, 434,… */

    int reverseNumber(int n){
        int reverse = 0;
        int remainder;

        while(n != 0){
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        return reverse;
    }

    boolean checkPalindrome(int n){
        int checkNum = reverseNumber(n);

        if(checkNum == n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        E_Palindrome_Number s = new E_Palindrome_Number();
        boolean result = s.checkPalindrome(n);

        if(result == true) System.out.println("Palindrome Number");
        else System.out.println("Not a Palindrome Number");
        
        sc.close();
    }
}
