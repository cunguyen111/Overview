package Java_Basic_And_OOP.E_String;
import java.util.Scanner;

public class A_Create_String_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
        sc.close();
    }
}
