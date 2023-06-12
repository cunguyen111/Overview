package Java_Basic_And_OOP.C_Array;

public class C_Using_For_Each {
    public static void main(String[] args) {
        int[] numbers = { 55, 64, 75, 80, 65 };

        int[] newArray = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            newArray[i] = numbers[i];
        }

        for(int i: newArray){
            System.out.println(i);
        }
    }
}
