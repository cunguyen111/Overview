package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class D_Count_The_Negative {
    /*Viết chương trình đếm số chữ cái nguyên âm trong một chuỗi. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String text = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            switch(str.charAt(i)){ //You can use if else statement
                case 'a':
                case 'e':
                case 'u':
                case 'i':
                case 'o':
                    count++;
                    break;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
